package com.winhead.onecatalog.adminapi.adapter;

import com.winhead.onecatalog.adminapi.domain.Catalog;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogContactRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogInfoRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogPasswordRequestDto;

public class CatalogAdapter {
    public static Catalog convert(EditCatalogInfoRequestDto editCatalogInfoRequestDto){
        return Catalog
                .builder()
                .login(editCatalogInfoRequestDto.getLogin())
                .fullName(editCatalogInfoRequestDto.getFullName())
                .cpfCnpj(editCatalogInfoRequestDto.getCpfCnpj())
                .ownerName(editCatalogInfoRequestDto.getOwnerName())
                .phone(editCatalogInfoRequestDto.getPhone())
                .email(editCatalogInfoRequestDto.getEmail())
                .minimumPrice(editCatalogInfoRequestDto.getMinimumPrice())
                .description(editCatalogInfoRequestDto.getDescription())
                .about(editCatalogInfoRequestDto.getAbout())
                .build();
    }

    public static Catalog convert(EditCatalogContactRequestDto editCatalogContactRequestDto){
        return Catalog
                .builder()
                .address(editCatalogContactRequestDto.getAddress())
                .cepAddress(editCatalogContactRequestDto.getCepAddress())
                .countryAddress(editCatalogContactRequestDto.getCountryAddress())
                .cityAddress(editCatalogContactRequestDto.getCityAddress())
                .moreAddress(editCatalogContactRequestDto.getMoreAddress())
                .numberAddress(editCatalogContactRequestDto.getNumberAddress())
                .stateAddress(editCatalogContactRequestDto.getStateAddress())
                .instagram(editCatalogContactRequestDto.getInstagram())
                .facebook(editCatalogContactRequestDto.getFacebook())
                .whatsapp(editCatalogContactRequestDto.getWhatsapp())
                .contactEmail(editCatalogContactRequestDto.getContactEmail())
                .build();
    }

}
