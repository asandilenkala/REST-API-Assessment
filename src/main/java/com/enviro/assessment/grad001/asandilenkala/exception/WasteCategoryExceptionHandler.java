package com.enviro.assessment.grad001.asandilenkala.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * The WasteCategoryExceptionHandler class is responsible for handling
 * exceptions related to invalid input and illegal arguments within the application.
 * It provides custom responses with appropriate HTTP status codes.
 */
public class WasteCategoryExceptionHandler {

    /**
     * This method handles validation errors that occur when the user input does not
     * conform to the constraints defined in the model.
     *
     * @param ex The MethodArgumentNotValidException that contains the details of the validation error.
     * @return A ResponseEntity containing a map of the field names and their respective error messages,
     *         with a BAD_REQUEST (400) HTTP status code.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationErrors(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        // Iterate through all the field errors and populate the map with error messages.
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage())
        );

        // Return the errors in the response body with a BAD_REQUEST status code.
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    /**
     * This method handles IllegalArgumentExceptions that occur in the application.
     * It returns a response with a custom error message and an appropriate HTTP status code.
     *
     * @param ex The IllegalArgumentException containing the error message.
     * @return A ResponseEntity containing the error message with a NOT_FOUND (404) HTTP status code.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        // Return the exception message in the response body with a NOT_FOUND status code.
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
