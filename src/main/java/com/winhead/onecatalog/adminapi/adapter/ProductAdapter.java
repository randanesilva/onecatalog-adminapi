package com.winhead.onecatalog.adminapi.adapter;

import com.winhead.onecatalog.adminapi.domain.Product;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditProductRequestDto;

public class ProductAdapter {

    public static Product convert(EditProductRequestDto editProductRequestDto){

        return Product
                .builder()
                .amount(editProductRequestDto.getAmount())
                .brand(editProductRequestDto.getBrand())
                .category(editProductRequestDto.getCategory())
                .code(editProductRequestDto.getDescription())
                .costPrice(editProductRequestDto.getCostPrice())
                .currency(editProductRequestDto.getCurrency())
                .description(editProductRequestDto.getDescription())
                .detail(editProductRequestDto.getDetail())
                .height(editProductRequestDto.getHeight())
                .length(editProductRequestDto.getLength())
                .order(editProductRequestDto.getOrder())
                .pictures(editProductRequestDto.getPictures())
                .price(editProductRequestDto.getPrice())
                .splitSale(editProductRequestDto.isSplitSale())
                .subcategory(editProductRequestDto.getSubcategory())
                .title(editProductRequestDto.getTitle())
                .unit(editProductRequestDto.getUnit())
                .weight(editProductRequestDto.getWeight())
                .width(editProductRequestDto.getWidth())
                .build();

    }


}
