package com.winhead.onecatalog.adminapi.adapter;

import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.ProductResponseDto;
import com.winhead.onecatalog.adminapi.model.ProductModel;

import java.util.List;
import java.util.stream.Collectors;

public class ProductResponseDtoAdapter {
    public static List<ProductResponseDto> map(List<ProductModel> productModels){
        return productModels
                .stream()
                .map( productModel -> convert(productModel))
                .collect(Collectors.toList());
    }

    public static ProductResponseDto convert(ProductModel productModel){
        return ProductResponseDto
                .builder()
                .amount(productModel.getAmount())
                .brand(productModel.getBrand())
                .code(productModel.getCode())
                .category(productModel.getCategory())
                .costPrice(productModel.getCostPrice())
                .currency(productModel.getCurrency())
                .description(productModel.getDescription())
                .detail(productModel.getDetail())
                .height(productModel.getHeight())
                .length(productModel.getLength())
                .order(productModel.getOrder())
                .pictures(productModel.getPictures())
                .price(productModel.getPrice())
                .splitSale(productModel.isSplitSale())
                .status(productModel.getStatus())
                .subcategory(productModel.getSubcategory())
                .title(productModel.getTitle())
                .unit(productModel.getUnit())
                .weight(productModel.getWeight())
                .width(productModel.getWidth())
                .build();
    }
}
