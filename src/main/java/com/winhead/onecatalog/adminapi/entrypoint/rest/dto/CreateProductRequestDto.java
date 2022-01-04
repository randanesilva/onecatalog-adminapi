package com.winhead.onecatalog.adminapi.entrypoint.rest.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequestDto {
    private String title;
    private String description;
    private String detail;
    private List<String> size;
    private List<String> pictures;
    private List<String> colors;
    private BigDecimal price;
    private String currency;
    private float amount;
    private String unit;
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
