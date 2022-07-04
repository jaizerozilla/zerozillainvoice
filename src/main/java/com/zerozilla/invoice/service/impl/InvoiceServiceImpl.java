package com.zerozilla.invoice.service.impl;

import com.zerozilla.invoice.exception.ResourceNotFoundException;
import com.zerozilla.invoice.model.Invoice;
import com.zerozilla.invoice.repo.InvoiceRepository;
import com.zerozilla.invoice.repo.ProductRepository;
import com.zerozilla.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Invoice saveInvoice(Invoice invoice) {

        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id).
                orElseThrow(()->new ResourceNotFoundException("Invoice","Id",id));
    }

    @Override
    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);

    }

    @Override
    public List<Invoice> allInvoice() {
        return invoiceRepository.findAll();
    }



}
