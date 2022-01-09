package com.winhead.onecatalog.adminapi.usecase.impl;


import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.CatalogRepository;
import com.winhead.onecatalog.adminapi.repository.ProductRepository;
import com.winhead.onecatalog.adminapi.usecase.CreateProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class CreateProductUseCaseImpl implements CreateProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CatalogRepository catalogRepository;

    @Override
    public boolean execute(ProductModel productModel, CatalogModel catalog) {
            long code = catalog.getProductSequence()+1;
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            productModel.setCatalog(catalog.getId());
            productModel.setCreateTimeStamp(timestamp.getTime());
            productModel.setUpdateTimeStamp(timestamp.getTime());
            productModel.setStatus("ENABLED");
            productModel.setCode(Long.toString(code));
            catalog.setProductSequence(code);

            catalogRepository.save(catalog);
            productRepository.save(productModel);
            return true;
    }
}
