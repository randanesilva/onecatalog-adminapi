package com.winhead.onecatalog.adminapi.entrypoint.rest;

import com.winhead.onecatalog.adminapi.adapter.CatalogAdapter;
import com.winhead.onecatalog.adminapi.adapter.CatalogModelAdapter;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateCatalogRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogContactRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogInfoRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogPasswordRequestDto;
import com.winhead.onecatalog.adminapi.usecase.CreateCatalogUseCase;
import com.winhead.onecatalog.adminapi.usecase.EditCatalogInfoUseCase;
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
    EditCatalogInfoUseCase editCatalogInfoUseCase;

    @PostMapping(value = "catalog/editCatalogInfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editCatalogInfo(@RequestBody EditCatalogInfoRequestDto editCatalogInfoRequestDto) {
        editCatalogInfoUseCase.execute(CatalogAdapter.convert(editCatalogInfoRequestDto),"");
        return ok("");
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


}
