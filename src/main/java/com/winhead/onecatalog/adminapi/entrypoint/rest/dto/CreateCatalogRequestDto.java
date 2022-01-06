package com.winhead.onecatalog.adminapi.entrypoint.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCatalogRequestDto {
    @NotBlank(message = "Campo email está vazio")
    private String email;
    @NotBlank(message = "Campo login está vazio")
    private String login;
    @NotBlank(message = "Campo password está vazio")
    private String password;
    @NotBlank(message = "Campo cpf está vazio")
    private String cpfCnpj;
    @NotBlank(message = "Campo nome da loja está vazio")
    private String fullName;
    @NotBlank(message = "Campo nome do proprietário está vazio")
    private String ownerName;
    @NotBlank(message = "Campo fone do proprietário está vazio")
    private String ownerPhone;
}
