package com.winhead.onecatalog.adminapi.usecase;

import com.winhead.onecatalog.adminapi.domain.Catalog;

public interface EditCatalogInfoUseCase {
    boolean execute(Catalog catalog,String username);
}
