package com.winhead.onecatalog.adminapi.entrypoint.rest;

import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateProductRequestDto;
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
public class ProductsController {


    @PostMapping(value = "product/createProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {

        return ok("");
    }

    @PostMapping(value = "product/listProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity listProduct() {
        return ok("");
    }

    @PostMapping(value = "product/editProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }

    @PostMapping(value = "product/getProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }

    @PostMapping(value = "product/removeProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity removeProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }

    @PostMapping(value = "product/disableProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity disableProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }

    @PostMapping(value = "product/stockUpdateProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity stockUpdateProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }
}