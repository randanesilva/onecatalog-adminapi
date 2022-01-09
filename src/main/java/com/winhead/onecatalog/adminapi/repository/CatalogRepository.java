package com.winhead.onecatalog.adminapi.repository;

import com.winhead.onecatalog.adminapi.model.CatalogModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CatalogRepository extends MongoRepository<CatalogModel, String> {
    Optional<CatalogModel> findOneByLogin(String login);
    Boolean existsByLogin(String username);
    Boolean existsByEmail(String email);
}
