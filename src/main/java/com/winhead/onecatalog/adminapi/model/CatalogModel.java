package com.winhead.onecatalog.adminapi.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@Document(collection = "catalog")
public class CatalogModel {
    @Id
    private String id;
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
