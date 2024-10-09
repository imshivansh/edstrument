package com.example.edstruments.Exception;

import com.example.edstruments.Constants.ProductConstant;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;


@Log4j2
@ControllerAdvice
public class ProductGlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<?>handleProductNotFoundException(ProductNotFoundException e){
        log.error(e);
        ServerErrorResponse serverErrorResponse = new ServerErrorResponse(e.getMessage(),e.getId());
        return new ResponseEntity<>(serverErrorResponse, HttpStatus.NOT_FOUND);
    }

@ExceptionHandler(NoProductExistExeption.class)
    public ResponseEntity<?>handleNoProductAddedInDbException(NoProductExistExeption e){
        log.error(e);
        ServerErrorResponse serverErrorResponse = new ServerErrorResponse<>(e.getMessage(),ProductConstant.NA);
        return new ResponseEntity<>(serverErrorResponse,HttpStatus.NOT_FOUND);

}
        @ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
            Map<String, String> errors = new HashMap<>();
            ex.getBindingResult().getAllErrors().forEach((error) -> {
                String fieldName = ((FieldError) error).getField();
                String errorMessage = error.getDefaultMessage();
                errors.put(fieldName, errorMessage);
            });

            
            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        }
    }



