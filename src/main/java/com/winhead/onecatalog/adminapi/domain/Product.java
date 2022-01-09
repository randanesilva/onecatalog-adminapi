package com.winhead.onecatalog.adminapi.domain;

import com.winhead.onecatalog.adminapi.model.ProductDetailModel;
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
public class Product {
    private String title;
    private String description;
    private List<ProductDetail> detail;
    private List<String> pictures;
    private BigDecimal price;
    private BigDecimal costPrice;
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
    private String catalog;
    private String status;
    private int order;
    private long createTimeStamp;
    private long updateTimeStamp;
}
