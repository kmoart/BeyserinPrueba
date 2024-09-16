package com.example.RestClient.model;

import org.apache.commons.lang3.Validate;

public class PersonTelefono {

    private final String value;

    public PersonTelefono(String value) {
        //Validate.notNull(value, "Person telefono can not be blank");
        //trim elimina los espacios a lado y lado
        //Validate.isTrue(value.trim().length() == 36, "Person telefono can not different than 36 characters" );
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PersonTelefono{" +
                "value='" + value + '\'' +
                '}';
    }
}
