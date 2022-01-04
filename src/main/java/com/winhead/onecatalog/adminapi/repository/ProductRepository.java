package com.winhead.onecatalog.adminapi.repository;

import com.winhead.onecatalog.adminapi.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductModel, String> {
}
