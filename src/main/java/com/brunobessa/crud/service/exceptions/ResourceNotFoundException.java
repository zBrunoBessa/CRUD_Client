package com.brunobessa.crud.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException (String msg) {
        super(msg);
    }
}
