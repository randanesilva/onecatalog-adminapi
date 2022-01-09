package com.winhead.onecatalog.adminapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {
    private String size;
    private String color;
    private String amount;
    private String unit;
}
