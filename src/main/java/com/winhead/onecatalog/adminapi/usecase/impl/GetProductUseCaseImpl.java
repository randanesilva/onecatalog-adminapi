package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.ProductRepository;
import com.winhead.onecatalog.adminapi.usecase.GetProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProductUseCaseImpl implements GetProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductModel execute(String product) {
        ProductModel productModel = productRepository.findOneByCode(product);
        return productModel;
    }
}
