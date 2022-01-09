package com.winhead.onecatalog.adminapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OneCatalogUser {
    private String username;
    private String email;
    private String type;
}
