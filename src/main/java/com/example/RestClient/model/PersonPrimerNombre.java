package com.example.RestClient.model;

import org.apache.commons.lang3.Validate;

public class PersonPrimerNombre {

    private final String value;

    public PersonPrimerNombre(String value) {
        //Validate.notNull(value, "Person primer nombre can not be blank");
        //trim elimina los espacios a lado y lado
        //Validate.isTrue(value.trim().length() == 36, "Person primer nombre can not different than 36 characters" );
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PersonPrimerNombre{" +
                "value='" + value + '\'' +
                '}';
    }
}
