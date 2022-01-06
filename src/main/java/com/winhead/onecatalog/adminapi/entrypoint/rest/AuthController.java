package com.winhead.onecatalog.adminapi.entrypoint.rest;

import com.winhead.onecatalog.adminapi.adapter.CatalogModelAdapter;
import com.winhead.onecatalog.adminapi.configuration.jwt.JwtUtils;
import com.winhead.onecatalog.adminapi.configuration.service.UserDetailsImpl;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.CreateCatalogRequestDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.JwtResponseDto;
import com.winhead.onecatalog.adminapi.entrypoint.rest.dto.LoginRequestDto;
import com.winhead.onecatalog.adminapi.usecase.CreateCatalogUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/" )
public class AuthController {

    @Autowired
    CreateCatalogUseCase createCatalogUseCase;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping(value = "auth/singup")
    public ResponseEntity authenticateUser(@RequestBody CreateCatalogRequestDto createCatalogRequestDto) {
        if(createCatalogUseCase.execute(CatalogModelAdapter.convert(createCatalogRequestDto))){
            return ok("Conta Criada com sucesso!");
        }else{
            return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping("auth/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequestDto loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        return ResponseEntity.ok(JwtResponseDto
                .builder()
                .token(jwt)
                .email(userDetails.getEmail())
                .id(userDetails.getId())
                .roles(roles)
                .username(userDetails.getUsername())
                .build());
    }
}
