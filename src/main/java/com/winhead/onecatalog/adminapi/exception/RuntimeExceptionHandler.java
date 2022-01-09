package com.winhead.onecatalog.adminapi.exception;

import com.winhead.onecatalog.adminapi.exception.entity.ErrorData;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@RestControllerAdvice
public class RuntimeExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RequestGenericException.class)
    public ResponseEntity<ErrorData> handleRequestGenericException(RequestGenericException ex){

        return new ResponseEntity<>(ex.getErro(), HttpStatus.valueOf(ex.getStatusCode()));
    }

    private ErrorData createErrorData(String title,String code,String detail){

        return ErrorData
                .builder()
                .title(title)
                .code(code)
                .detail(detail)
                .build();
    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
       List<ObjectError> errors = ex.getAllErrors();

        String mensagem = "Erro no preenchimento dos campos";

        if(!errors.isEmpty()){
           mensagem = errors.get(0).getDefaultMessage();
        }

        ErrorData errorData = createErrorData("Erro no preenchimento dos campos", status.toString(),mensagem);
        return new ResponseEntity<>(errorData, status);
    }

}
