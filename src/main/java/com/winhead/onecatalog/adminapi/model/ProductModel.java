package com.winhead.onecatalog.adminapi.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@Document(collection = "product")
public class ProductModel {
    @Id
    private String id;
    private String title;
    private String description;
    private List<ProductDetailModel> detail;
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
