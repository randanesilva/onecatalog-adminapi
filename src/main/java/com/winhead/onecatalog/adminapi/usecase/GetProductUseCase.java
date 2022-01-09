package com.winhead.onecatalog.adminapi.usecase;

import com.winhead.onecatalog.adminapi.model.ProductModel;

public interface GetProductUseCase {
    ProductModel execute(String product);
}
