package za.co.digitalplatoon.invoiceservice.contoller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.digitalplatoon.invoiceservice.model.Invoice;
import za.co.digitalplatoon.invoiceservice.service.InvoiceService;

@RestController
@RequestMapping("invoices")
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceService;
	
	@GetMapping
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    @PostMapping
    public Invoice addInvoice(@Valid @RequestBody Invoice invoice) {
        return invoiceService.addInvoice(invoice);
    }
    
    @GetMapping(path = "/{invoiceId}")
    public Optional<Invoice> viewInvoice(@PathVariable(name="invoiceId") Long id) {
        return invoiceService.viewInvoice(id);
    }
    
}
