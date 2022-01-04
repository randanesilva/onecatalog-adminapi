package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.repository.CatalogRepository;
import com.winhead.onecatalog.adminapi.usecase.CreateCatalogUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreateCatalogUseCaseImpl implements CreateCatalogUseCase {

    @Autowired
    CatalogRepository catalogRepository;

    @Override
    public boolean execute(CatalogModel catalogModel) {
        try{
            catalogRepository.save(catalogModel);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}
