package com.winhead.onecatalog.adminapi.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@Document(collection = "catalog")
public class CatalogModel {
    @Id
    private String id;
    @Indexed(unique = true)
    private String email;
    @Indexed(unique = true)
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
    private long productSequence;
    @DBRef
    private Set<Role> roles = new HashSet<>();

}
