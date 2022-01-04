package com.winhead.onecatalog.adminapi.adapter;

import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateCatalogRequestDto;
import com.winhead.onecatalog.adminapi.model.CatalogModel;

import java.math.BigDecimal;

public class CatalogModelAdapter {

    public static CatalogModel convert(CreateCatalogRequestDto createCatalogRequestDto){
        return CatalogModel
                .builder()
                .about("")
                .address("")
                .cepAddress("")
                .cityAddress("")
                .contactEmail("")
                .countryAddress("BRASIL")
                .cover("")
                .cpfCnpj(createCatalogRequestDto.getCpfCnpj())
                .description("")
                .email(createCatalogRequestDto.getEmail())
                .facebook("")
                .fullName(createCatalogRequestDto.getFullName())
                .instagram("")
                .login(createCatalogRequestDto.getLogin())
                .minimumPrice(new BigDecimal(0))
                .moreAddress("")
                .numberAddress("")
                .ownerName(createCatalogRequestDto.getOwnerName())
                .password(createCatalogRequestDto.getPassword())
                .phone(createCatalogRequestDto.getOwnerPhone())
                .picture("")
                .statusCatalog("WAIT APPROVAL")
                .site("")
                .stateAddress("")
                .whatsapp("")
                .build();
    }
}
