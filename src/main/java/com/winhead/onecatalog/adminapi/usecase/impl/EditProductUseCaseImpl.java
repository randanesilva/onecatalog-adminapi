package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.domain.Product;
import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.ProductRepository;
import com.winhead.onecatalog.adminapi.usecase.EditProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class EditProductUseCaseImpl implements EditProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public boolean execute(Product product,String codeProduct) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        ProductModel productModel = productRepository.findOneByCode(codeProduct);
        productModel.setUpdateTimeStamp(timestamp.getTime());
        productModel.setAmount(product.getAmount());
        productModel.setBrand(product.getBrand());
        productModel.setCategory(product.getCategory());
        productModel.setCostPrice(product.getCostPrice());
        productModel.setPrice(product.getPrice());
        productModel.setCurrency(product.getCurrency());
        productModel.setDetail(product.getDetail());
        productModel.setDescription(product.getDescription());
        productModel.setHeight(product.getHeight());
        productModel.setLength(product.getLength());
        productModel.setWeight(product.getWeight());
        productModel.setWidth(product.getWidth());
        productModel.setOrder(product.getOrder());
        productModel.setPictures(product.getPictures());
        productModel.setSplitSale(product.isSplitSale());
        productModel.setSubcategory(product.getSubcategory());
        productModel.setTitle(product.getTitle());

        productRepository.save(productModel);
        return false;
    }
}
