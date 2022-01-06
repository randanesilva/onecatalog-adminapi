package com.winhead.onecatalog.adminapi.repository;

import com.winhead.onecatalog.adminapi.domain.Enum.ERole;
import com.winhead.onecatalog.adminapi.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
