package com.winhead.onecatalog.adminapi.entrypoint.rest.swagger;

import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.EditCatalogInfoRequestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface CatalogControllerSwagger {
    @Operation(summary = "", description = "")
    @ApiResponse(responseCode = "200", description = "Edita as informações gerais do perfil")
    @ApiResponse(responseCode = "400", description = "Erro ao editar perfil")
    ResponseEntity editCatalogInfo(@RequestBody EditCatalogInfoRequestDto editCatalogInfoRequestDto);
}
