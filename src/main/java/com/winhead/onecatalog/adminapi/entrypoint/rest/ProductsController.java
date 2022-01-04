package com.winhead.onecatalog.adminapi.entrypoint.rest;

import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateProductRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/" )
public class ProductsController {

    @PostMapping(value = "product/createProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }

    @PostMapping(value = "product/listProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity listProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }

    @PostMapping(value = "product/editProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }


}