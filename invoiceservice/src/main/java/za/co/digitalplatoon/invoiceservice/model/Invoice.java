package za.co.digitalplatoon.invoiceservice.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Invoice {

	@Id
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonProperty
	private String client;
	@JsonProperty
	private Long vatRate;
	@JsonProperty
	private Date invoiceDate;

	//add one to many and lazy fetch all items
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<LineItem> lineItems = new HashSet<LineItem>();	
	
	//Default Constructor
	public Invoice() {};
	
	//Add Invoice Constructor
	public Invoice(String client, Long vatRate, Date invoiceDate) {
		setClient(client);
		setVatRate(vatRate);
		setInvoiceDate(invoiceDate);
	}
	
	//Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Long getVatRate() {
		return vatRate;
	}

	public void setVatRate(Long vatRate) {
		this.vatRate = vatRate;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public BigDecimal getSubTotal() { 
		return lineItems.stream()
				.map(lineItem -> lineItem.getLineItemTotal())
				.reduce(BigDecimal.ZERO, BigDecimal::add)
				.setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal getVat() {
		return getSubTotal()
				.multiply(BigDecimal.valueOf(vatRate * 0.01))
				.setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal getTotal() {
		return getSubTotal()
				.multiply(getVat())
				.setScale(2, RoundingMode.HALF_UP);
	}

}
