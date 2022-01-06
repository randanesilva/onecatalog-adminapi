package com.winhead.onecatalog.adminapi.usecase;

import com.winhead.onecatalog.adminapi.model.ProductModel;

public interface CreateProductUseCase {
    boolean execute(ProductModel productModel);
}
