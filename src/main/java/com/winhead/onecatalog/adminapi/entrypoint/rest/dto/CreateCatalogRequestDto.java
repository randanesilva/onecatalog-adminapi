package com.winhead.onecatalog.adminapi.entrypoint.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCatalogRequestDto {
    private String email;
    private String login;
    private String password;
    private String cpfCnpj;
    private String fullName;
    private String ownerName;
    private String ownerPhone;
}
