package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.domain.Catalog;
import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.repository.CatalogRepository;
import com.winhead.onecatalog.adminapi.usecase.EditCatalogInfoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EditCatalogInfoUseCaseImpl implements EditCatalogInfoUseCase {

    @Autowired
    CatalogRepository catalogRepository;

    @Override
    public boolean execute(Catalog catalog,String login) {
        try
        {

            CatalogModel catalogModel = catalogRepository.findOneByLogin(login)
                    .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + login));
            catalogModel.setLogin(catalog.getLogin());
            catalogModel.setFullName(catalog.getFullName());
            catalogModel.setCpfCnpj(catalog.getCpfCnpj());
            catalogModel.setOwnerName(catalog.getOwnerName());
            catalogModel.setPhone(catalog.getPhone());
            catalogModel.setSite(catalog.getSite());
            catalogModel.setEmail(catalog.getEmail());
            catalogModel.setDescription(catalog.getDescription());
            catalogModel.setMinimumPrice(catalog.getMinimumPrice());
            catalogModel.setAbout(catalog.getAbout());
            catalogRepository.save(catalogModel);
            return  true;

        }
        catch (Exception e){
            return false;
        }

    }
}
