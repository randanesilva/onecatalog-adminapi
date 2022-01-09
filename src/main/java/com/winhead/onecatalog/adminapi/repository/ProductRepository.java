package com.winhead.onecatalog.adminapi.repository;

import com.winhead.onecatalog.adminapi.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<ProductModel, String> {
    List<ProductModel> findByCatalog(String catalog);
    ProductModel findOneByCode(String code);
}
