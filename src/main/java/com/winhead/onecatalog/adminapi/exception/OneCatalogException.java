package com.winhead.onecatalog.adminapi.exception;

import com.winhead.onecatalog.adminapi.exception.entity.ErrorData;


import java.util.Set;

public class OneCatalogException extends RuntimeException{

    private static final long serialVersionUID = -6150280219358807993L;

    private final int statusCode;
    private final Set<ErrorData> error;

    public OneCatalogException(Set<ErrorData> errors , int statusCode){
        this.error = errors;
        this.statusCode = statusCode;
    }

    public int getStatusCode(){return  statusCode;}

    public Set<ErrorData> getError(){return  this.error;}



}
