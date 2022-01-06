package com.winhead.onecatalog.adminapi.usecase.impl;

import com.winhead.onecatalog.adminapi.domain.Enum.ERole;
import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.model.Role;
import com.winhead.onecatalog.adminapi.repository.CatalogRepository;
import com.winhead.onecatalog.adminapi.repository.RoleRepository;
import com.winhead.onecatalog.adminapi.usecase.CreateCatalogUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class CreateCatalogUseCaseImpl implements CreateCatalogUseCase {

    @Autowired
    CatalogRepository catalogRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public boolean execute(CatalogModel catalogModel) {
        try{
            if (catalogRepository.existsByLogin(catalogModel.getLogin())) {
                return false;
            }

            if (catalogRepository.existsByEmail(catalogModel.getEmail())) {
                return false;
            }

            catalogModel.setPassword(encoder.encode(catalogModel.getPassword()));

            Set<String> strRoles = new HashSet<>();
            Set<Role> roles = new HashSet<>();

            if (strRoles == null) {
                Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                        .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                roles.add(userRole);
            } else {
                strRoles.forEach(role -> {
                    switch (role) {
                        case "admin":
                            Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                            roles.add(adminRole);

                            break;
                        default:
                            Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                            roles.add(userRole);
                    }
                });
            }

            catalogModel.setRoles(roles);

            catalogRepository.save(catalogModel);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}
