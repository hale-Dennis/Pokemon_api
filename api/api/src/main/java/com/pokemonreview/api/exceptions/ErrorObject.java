package com.pokemonreview.api.exceptions;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorObject {
    private Integer statusCode;
    private Date timestamp;
    private String message;
}
