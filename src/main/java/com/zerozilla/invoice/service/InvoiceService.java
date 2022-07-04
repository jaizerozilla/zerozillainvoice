package com.zerozilla.invoice.service;

import com.zerozilla.invoice.model.Invoice;

import java.util.List;

public interface InvoiceService {

    Invoice saveInvoice (Invoice invoice);

    Invoice getInvoiceById (Long id);

    void deleteInvoice (Long id);

    List<Invoice> allInvoice();






}
