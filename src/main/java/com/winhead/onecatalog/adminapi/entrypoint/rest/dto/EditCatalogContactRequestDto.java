package com.winhead.onecatalog.adminapi.entrypoint.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EditCatalogContactRequestDto {
    private String address;
    private String numberAddress;
    private String cepAddress;
    private String cityAddress;
    private String stateAddress;
    private String countryAddress;
    private String moreAddress;
    private String instagram;
    private String whatsapp;
    private String facebook;
    private String contactEmail;
}
