package com.winhead.onecatalog.adminapi.usecase.impl;


import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.ProductRepository;
import com.winhead.onecatalog.adminapi.usecase.CreateProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateProductUseCaseImpl implements CreateProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public boolean execute(ProductModel productModel) {
        try{
            productRepository.save(productModel);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
