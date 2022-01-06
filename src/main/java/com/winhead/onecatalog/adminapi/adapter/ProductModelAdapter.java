package com.winhead.onecatalog.adminapi.adapter;

import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateProductRequestDto;
import com.winhead.onecatalog.adminapi.model.ProductDetailModel;
import com.winhead.onecatalog.adminapi.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ProductModelAdapter {

    public static ProductModel convert(CreateProductRequestDto createProductRequestDto){

        List<ProductDetailModel> productDetailModelList = new ArrayList<>();


        createProductRequestDto.getDetail().forEach(productDetailDto -> {
        productDetailModelList.add(ProductDetailModel
                .builder()
                .color(productDetailDto.getColor())
                .size(productDetailDto.getSize())
                .amount(productDetailDto.getAmount())
                .unit(productDetailDto.getUnit())
                .build());
        });

        return ProductModel
                .builder()
                .detail(productDetailModelList)
                .price(createProductRequestDto.getPrice())
                .amount(createProductRequestDto.getHeight())
                .brand(createProductRequestDto.getBrand())
                .catalog("")
                .category(createProductRequestDto.getCategory())
                .code("")
                .createTimeStamp(0)
                .currency(createProductRequestDto.getCurrency())
                .description(createProductRequestDto.getDescription())
                .height(createProductRequestDto.getHeight())
                .length(createProductRequestDto.getLength())
                .order(createProductRequestDto.getOrder())
                .pictures(createProductRequestDto.getPictures())
                .splitSale(createProductRequestDto.isSplitSale())
                .status(createProductRequestDto.getStatus())
                .subcategory(createProductRequestDto.getSubcategory())
                .title(createProductRequestDto.getTitle())
                .unit(createProductRequestDto.getBrand())
                .updateTimeStamp(0)
                .weight(createProductRequestDto.getWeight())
                .width(createProductRequestDto.getWidth())
                .build();

    }
}
