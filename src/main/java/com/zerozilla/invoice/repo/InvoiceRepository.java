package com.zerozilla.invoice.repo;

import com.zerozilla.invoice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
