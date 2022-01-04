package com.winhead.onecatalog.adminapi.repository;

import com.winhead.onecatalog.adminapi.model.CatalogModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogRepository extends MongoRepository<CatalogModel, String> {
}
