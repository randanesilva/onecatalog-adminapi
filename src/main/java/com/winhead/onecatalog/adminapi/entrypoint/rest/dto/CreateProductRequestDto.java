package com.winhead.onecatalog.adminapi.entrypoint.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequestDto {
    @NotBlank(message = "Campo login está vazio")
    private String title;
    @NotBlank(message = "Campo login está vazio")
    private String description;
    private List<ProductDetailDto> detail;
    private List<String> pictures;
    private BigDecimal price;
    private String currency;
    private boolean splitSale;
    private float weight;
    private float height;
    private float width;
    private float length;
    private String category;
    private String subcategory;
    private String brand;
    private String code;
    private String user;
    private String status;
    private int order;
}
