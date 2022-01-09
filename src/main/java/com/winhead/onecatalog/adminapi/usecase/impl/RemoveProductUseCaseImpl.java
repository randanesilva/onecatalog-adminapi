package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.ProductRepository;
import com.winhead.onecatalog.adminapi.usecase.RemoveProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveProductUseCaseImpl implements RemoveProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public boolean execute(String code) {
        ProductModel productModel = productRepository.findOneByCode(code);
        productModel.setStatus("REMOVED");
        productRepository.save(productModel);
        return true;
    }
}
