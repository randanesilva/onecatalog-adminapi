package com.winhead.onecatalog.adminapi.entrypoint.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EditCatalogInfoRequestDto {
    @NotBlank(message = "Campo login está vazio")
    private String login;
    @NotBlank(message = "Campo nome da loja está vazio")
    private String fullName;
    @NotBlank(message = "Campo cpf está vazio")
    private String cpfCnpj;
    @NotBlank(message = "Campo nome do proprietário está vazio")
    private String ownerName;
    @NotBlank(message = "Campo fone do proprietário está vazio")
    private String phone;
    private String site;
    @NotBlank(message = "Campo email está vazio")
    @Email
    private String email;
    private String description;
    private BigDecimal minimumPrice;
    private String about;
}
