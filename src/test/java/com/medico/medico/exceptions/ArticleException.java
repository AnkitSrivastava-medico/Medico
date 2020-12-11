package com.medico.medico.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ArticleException extends RuntimeException {
    public ArticleException(String message) {
        super(message);
    }
}
