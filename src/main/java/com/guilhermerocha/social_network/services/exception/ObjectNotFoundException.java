package com.guilhermerocha.social_network.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serviceVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
