package io.github.jonas.rest.dto;

import jakarta.validation.ConstraintViolation;
import lombok.Data;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class ResponseError {

    private String message;
    private Collection<FieldError> errors = new HashSet<>();

    public ResponseError(String message, Collection<FieldError> errors) {
        this.message = message;
        this.errors = errors;
    }

    public static <T> ResponseError createFromValidation(Set<ConstraintViolation<T>> violations){
        List<FieldError> errors = violations.stream().map(x ->
                new FieldError(x.getPropertyPath().toString(), x.getMessage())).toList();

        String message = "Validation Error";
        return new ResponseError(message, errors);
    }
}
