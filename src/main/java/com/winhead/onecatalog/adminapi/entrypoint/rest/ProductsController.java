package com.winhead.onecatalog.adminapi.entrypoint.rest;

import com.winhead.onecatalog.adminapi.adapter.ProductAdapter;
import com.winhead.onecatalog.adminapi.adapter.ProductModelAdapter;
import com.winhead.onecatalog.adminapi.adapter.ProductResponseDtoAdapter;
import com.winhead.onecatalog.adminapi.domain.OneCatalogUser;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateProductRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditProductRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.GenericResponseDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.ProductResponseDto;
import com.winhead.onecatalog.adminapi.exception.RequestGenericException;
import com.winhead.onecatalog.adminapi.model.CatalogModel;
import com.winhead.onecatalog.adminapi.model.ProductModel;
import com.winhead.onecatalog.adminapi.repository.CatalogRepository;
import com.winhead.onecatalog.adminapi.usecase.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/" )
public class ProductsController {

    @Autowired
    CreateProductUseCase createProductUseCase;

    @Autowired
    EditProductUseCase editProductUseCase;

    @Autowired
    ListProductUseCase listProductUseCase;

    @Autowired
    GetProductUseCase getProductUseCase;

    @Autowired
    DisableProductUseCase disableProductUseCase;

    @Autowired
    RemoveProductUseCase removeProductUseCase;

    @Autowired
    CatalogRepository catalogRepository;


    @PostMapping(value = "product/createProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenericResponseDto> createProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        CatalogModel catalog = getUsuarioLogado();
        createProductUseCase.execute(ProductModelAdapter.convert(createProductRequestDto),catalog);
        return ok(GenericResponseDto.builder().code("200").detail("Produto criado com sucesso").title("createProduct").build());
    }

    @PostMapping(value = "product/listProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProductResponseDto>> listProduct() {
        CatalogModel catalog = getUsuarioLogado();
        List<ProductModel> productModels = listProductUseCase.execute(catalog);
        return ok(ProductResponseDtoAdapter.map(productModels));
    }

    @PostMapping(value = "product/editProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenericResponseDto> editProduct(@RequestBody EditProductRequestDto editProductRequestDto,@RequestParam String product) {
        editProductUseCase.execute(ProductAdapter.convert(editProductRequestDto),product);
        return ok(GenericResponseDto.builder().code("200").detail("Produto editado com sucesso!").title("editProduct").build());
    }

    @PostMapping(value = "product/getProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductResponseDto> getProduct(@RequestParam String product) {
        ProductModel productModel = getProductUseCase.execute(product);
        return ok(ProductResponseDtoAdapter.convert(productModel));
    }

    @PostMapping(value = "product/removeProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenericResponseDto> removeProduct(@RequestParam String product) {
        removeProductUseCase.execute(product);
        return ok(GenericResponseDto.builder().code("200").detail("Produto removido com sucesso!").title("removeProduct").build());
    }

    @PostMapping(value = "product/disableProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GenericResponseDto> disableProduct(@RequestParam String product) {
        disableProductUseCase.execute(product);
        return ok(GenericResponseDto.builder().code("200").detail("Produto desabilitado com sucesso!").title("disableProduct").build());
    }

    @PostMapping(value = "product/stockUpdateProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity stockUpdateProduct(@RequestBody CreateProductRequestDto createProductRequestDto) {
        return ok("");
    }

    private CatalogModel getUsuarioLogado() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        CatalogModel catalogModel = catalogRepository.findOneByLogin(userDetails.getUsername())
                .orElseThrow(() -> new RequestGenericException("400","Erro na consulta de usuário","Usuário não encontrado na base", 400 ));

        return catalogModel;
    }
}