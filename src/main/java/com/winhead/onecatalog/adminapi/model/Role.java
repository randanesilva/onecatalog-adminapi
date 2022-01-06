package com.winhead.onecatalog.adminapi.model;

import com.winhead.onecatalog.adminapi.domain.Enum.ERole;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "roles")
public class Role {
    @Id
    private String id;
    private ERole name;
}
