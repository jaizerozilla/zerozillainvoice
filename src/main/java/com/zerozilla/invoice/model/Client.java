package com.zerozilla.invoice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client_tab")
public class Client{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id",nullable = false, updatable = false)
    private Long clientId;

    @Column(name = "client_companyname_col")
    private String CompanyName;

    @Column(name = "client_email_col")
    private String email;

    @Column(name = "client_Alteremail_col")
    private String alternativeEmail;

    @Column(name = "client_country_col")
    private String country;

    @Column(name = "client_address_col")
    private String address;

    @Column(name = "client_city_col")
    private String city;

    @Column(name = "client_state_col")
    private String state;

    @Column(name = "client_mobile_col")
    private String  mobile;

    @Column(name = "client_gst_col")
    private String gstNumber;

//    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    private List<Invoice> invoices;
//
//    public Client(){invoices=new ArrayList<Invoice>();}

}
