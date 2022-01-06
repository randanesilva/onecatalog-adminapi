package com.winhead.onecatalog.adminapi.entrypoint.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EditCatalogInfoRequestDto {
    private String login;
    private String fullName;
    private String cpfCnpj;
    private String ownerName;
    private String phone;
    private String site;
    private String email;
    private String description;
    private BigDecimal minimumPrice;
    private String about;
}
