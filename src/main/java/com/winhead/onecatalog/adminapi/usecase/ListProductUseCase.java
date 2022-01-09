package com.winhead.onecatalog.adminapi.usecase;

import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.model.ProductModel;

import java.util.List;

public interface ListProductUseCase {
    List<ProductModel> execute(CatalogModel catalogModel);
}
