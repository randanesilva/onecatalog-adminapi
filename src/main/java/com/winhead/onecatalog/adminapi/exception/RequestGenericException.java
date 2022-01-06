package com.winhead.onecatalog.adminapi.exception;

import com.winhead.onecatalog.adminapi.exception.entity.ErrorData;
import lombok.Getter;

import java.util.HashSet;

@Getter
public class RequestGenericException extends OneCatalogException{

    private static final long serialVersionUid = 4423523351473164857L;
    private ErrorData erro;

    public RequestGenericException(String code, String title, String message, int statusCode){
        super(new HashSet<>(), statusCode);
        this.erro = ErrorData
                .builder()
                .code(code)
                .detail(message)
                .title(title)
                .build();
    }
}
