package za.co.digitalplatoon.invoiceservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import za.co.digitalplatoon.invoiceservice.model.Invoice;

public interface InvoiceService {
	
	Invoice addInvoice(Invoice invoice);
	
	List<Invoice> getAllInvoices();
	
	Optional<Invoice> viewInvoice(Long id);
	
}
