package com.winhead.onecatalog.adminapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Catalog {
    private String email;
    private String login;
    private String password;
    private String cpfCnpj;
    private String fullName;
    private String ownerName;
    private String phone;
    private String instagram;
    private String whatsapp;
    private String facebook;
    private String site;
    private String contactEmail;
    private String description;
    private String picture;
    private String cover;
    private BigDecimal minimumPrice;
    private String about;
    private String address;
    private String numberAddress;
    private String cepAddress;
    private String cityAddress;
    private String stateAddress;
    private String countryAddress;
    private String moreAddress;
    private String statusCatalog;

}
