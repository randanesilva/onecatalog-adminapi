package com.winhead.onecatalog.adminapi.usecase;

import com.winhead.onecatalog.adminapi.domain.Product;
import com.winhead.onecatalog.adminapi.model.ProductModel;

public interface EditProductUseCase {
    boolean execute(Product product,String codeProduct);
}
