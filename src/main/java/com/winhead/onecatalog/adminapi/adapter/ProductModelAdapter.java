package com.winhead.onecatalog.adminapi.adapter;

import com.winhead.onecatalog.adminapi.domain.ProductDetail;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateProductRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditProductRequestDto;
import com.winhead.onecatalog.adminapi.model.ProductDetailModel;
import com.winhead.onecatalog.adminapi.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ProductModelAdapter {

    public static ProductModel convert(CreateProductRequestDto createProductRequestDto){

        List<ProductDetail> productDetailModelList = new ArrayList<>();


        createProductRequestDto.getDetail().forEach(productDetailDto -> {
        productDetailModelList.add(ProductDetail
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
                .costPrice(createProductRequestDto.getPrice())
                .brand(createProductRequestDto.getBrand())
                .costPrice(createProductRequestDto.getCostPrice())
                .catalog("")
                .category(createProductRequestDto.getCategory())
                .createTimeStamp(0)
                .currency(createProductRequestDto.getCurrency())
                .description(createProductRequestDto.getDescription())
                .height(createProductRequestDto.getHeight())
                .length(createProductRequestDto.getLength())
                .order(createProductRequestDto.getOrder())
                .pictures(createProductRequestDto.getPictures())
                .splitSale(createProductRequestDto.isSplitSale())
                .status("")
                .subcategory(createProductRequestDto.getSubcategory())
                .title(createProductRequestDto.getTitle())
                .unit(createProductRequestDto.getUnit())
                .updateTimeStamp(0)
                .weight(createProductRequestDto.getWeight())
                .width(createProductRequestDto.getWidth())
                .build();

    }


    public static ProductModel convert(EditProductRequestDto editProductRequestDto){

        List<ProductDetail> productDetailModelList = new ArrayList<>();


        editProductRequestDto.getDetail().forEach(productDetailDto -> {
            productDetailModelList.add(ProductDetail
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
                .price(editProductRequestDto.getPrice())
                .amount(editProductRequestDto.getHeight())
                .brand(editProductRequestDto.getBrand())
                .category(editProductRequestDto.getCategory())
                .currency(editProductRequestDto.getCurrency())
                .description(editProductRequestDto.getDescription())
                .height(editProductRequestDto.getHeight())
                .length(editProductRequestDto.getLength())
                .order(editProductRequestDto.getOrder())
                .pictures(editProductRequestDto.getPictures())
                .splitSale(editProductRequestDto.isSplitSale())
                .subcategory(editProductRequestDto.getSubcategory())
                .title(editProductRequestDto.getTitle())
                .unit(editProductRequestDto.getBrand())
                .weight(editProductRequestDto.getWeight())
                .width(editProductRequestDto.getWidth())
                .build();

    }


}
