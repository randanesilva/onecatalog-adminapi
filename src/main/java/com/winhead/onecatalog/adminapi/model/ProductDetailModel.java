package com.winhead.onecatalog.adminapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDetailModel {
    private String size;
    private String color;
    private String amount;
    private String unit;
}
