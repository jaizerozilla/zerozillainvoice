package com.zerozilla.invoice.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Inv_tab")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Inv_id_col")
    private Long id;


    @Column(name = "Inv_date_col")
    private Date date;

    @Column(name = "itemInv_subtotal_col")
    private Double subTotal;

    @Column(name = "itemInv_discount_col")
    private Double discount;

    @Column(name = "itemInv_cgst_col")
    private Double cgst;

    @Column(name = "itemInv_sgst_col")
    private Double sgst;

    @Column(name = "itemInv_totaltax_col")
    private Double totalTex;

    @Column(name = "itemInv_balanceDue_col")
    private Double balanceDue;

//    @OneToMany
//    @JoinColumn(name = "client_client_id")
//    private Client client;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;

    @PrePersist
    private void prePersist(){
        date = new Date();
    }




}
