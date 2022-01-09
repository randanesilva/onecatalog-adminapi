package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.ProductRepository;
import com.winhead.onecatalog.adminapi.usecase.ListProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListProductUseCaseImpl implements ListProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<ProductModel> execute(CatalogModel catalogModel) {
        return productRepository.findByCatalog(catalogModel.getId());
    }
}
