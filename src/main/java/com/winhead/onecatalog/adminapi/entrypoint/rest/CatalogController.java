package com.winhead.onecatalog.adminapi.entrypoint.rest;

import com.winhead.onecatalog.adminapi.adapter.CatalogAdapter;
import com.winhead.onecatalog.adminapi.domain.OneCatalogUser;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogContactRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogInfoRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogPasswordRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.swagger.CatalogControllerSwagger;
import com.winhead.onecatalog.adminapi.exception.RequestGenericException;
import com.winhead.onecatalog.adminapi.usecase.EditCatalogInfoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/" )
public class CatalogController implements CatalogControllerSwagger {

    @Autowired
    EditCatalogInfoUseCase editCatalogInfoUseCase;

    @PostMapping(value = "catalog/editCatalogInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editCatalogInfo(@Valid @RequestBody EditCatalogInfoRequestDto editCatalogInfoRequestDto) {
        OneCatalogUser oneCatalogUser = getUsuarioLogado();
        editCatalogInfoUseCase.execute(CatalogAdapter.convert(editCatalogInfoRequestDto), oneCatalogUser.getUsername());
        return ok("Alteração realizada com sucesso");

    }

    @PostMapping(value = "catalog/editCatalogContact", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editCatalogContact(@RequestBody EditCatalogContactRequestDto editCatalogContactRequestDto) {
        return ok("");
    }

    @PostMapping(value = "catalog/editCatalogPassword", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editCatalogPassword(@RequestBody EditCatalogPasswordRequestDto editCatalogPasswordRequestDto) {
        return ok("");
    }

    @PostMapping(value = "catalog/editCatalogPicture", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editCatalogPicture(@RequestBody EditCatalogPasswordRequestDto editCatalogPasswordRequestDto) {
        return ok("");
    }

    @PostMapping(value = "catalog/editCatalogCover", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editCatalogCover(@RequestBody EditCatalogPasswordRequestDto editCatalogPasswordRequestDto) {
        return ok("");
    }

    @PostMapping(value = "catalog/getCatalogInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getCatalogInfo(@RequestBody EditCatalogPasswordRequestDto editCatalogPasswordRequestDto) {
        return ok("");
    }

    @PostMapping(value = "catalog/getCatalogContact", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getCatalogContact(@RequestBody EditCatalogContactRequestDto editCatalogContactRequestDto) {
        return ok("");
    }

    private OneCatalogUser getUsuarioLogado() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return  OneCatalogUser.builder().username(userDetails.getUsername()).type(userDetails.getAuthorities().toArray()[0].toString()).build();
    }



}
