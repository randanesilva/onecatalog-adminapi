package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.ProductRepository;
import com.winhead.onecatalog.adminapi.usecase.DisableProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisableProductUseCaseImpl implements DisableProductUseCase {
    @Autowired
    ProductRepository productRepository;

    @Override
    public boolean execute(String code) {
        ProductModel productModel = productRepository.findOneByCode(code);
        productModel.setStatus("DISABLED");
        productRepository.save(productModel);
        return true;
    }
}
