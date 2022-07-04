package com.zerozilla.invoice.exception;

public class ResourceNotFoundException extends RuntimeException{

    String resourceName;
    String fieldname;
    long fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldname, long fieldValue) {
        super(String.format("%s not found with %s: %s",resourceName,fieldname,fieldValue));
        this.resourceName = resourceName;
        this.fieldname = fieldname;
        this.fieldValue = fieldValue;
    }
}
