package com.winhead.onecatalog.adminapi.usecase;

import com.winhead.onecatalog.adminapi.model.CatalogModel;

public interface CreateCatalogUseCase {
    boolean execute(CatalogModel catalogModel);
}
