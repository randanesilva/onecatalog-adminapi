package com.winhead.onecatalog.adminapi.entrypoint.rest;

import com.winhead.onecatalog.adminapi.adapter.CatalogModelAdapter;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateCatalogRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateProductRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogRequestDto;
import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.repository.CatalogRepository;
import com.winhead.onecatalog.adminapi.usecase.CreateCatalogUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/" )
public class CatalogController {

    @Autowired
    CreateCatalogUseCase createCatalogUseCase;

    @PostMapping(value = "catalog/createCatalog", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createCatalog(@RequestBody CreateCatalogRequestDto createCatalogRequestDto) {
        createCatalogUseCase.execute(CatalogModelAdapter.convert(createCatalogRequestDto));
        return ok("");
    }

    @PostMapping(value = "catalog/editCatalog", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editCatalog(@RequestBody EditCatalogRequestDto editCatalogRequestDto) {
        return ok("");
    }

}
