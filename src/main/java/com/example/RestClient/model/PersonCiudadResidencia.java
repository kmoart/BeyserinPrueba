package com.example.RestClient.model;

import org.apache.commons.lang3.Validate;

public class PersonCiudadResidencia {

    private final String value;

    public PersonCiudadResidencia(String value) {
        //Validate.notNull(value, "Person ciudad residencia can not be blank");
        //trim elimina los espacios a lado y lado
        //Validate.isTrue(value.trim().length() == 36, "Person ciudad residencia can not different than 36 characters" );
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PersonCiudadResidencia{" +
                "value='" + value + '\'' +
                '}';
    }
}
