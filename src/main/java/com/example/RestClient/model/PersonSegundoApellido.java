package com.example.RestClient.model;

import org.apache.commons.lang3.Validate;

public class PersonSegundoApellido {

    private final String value;

    public PersonSegundoApellido(String value) {
        //Validate.notNull(value, "Person segundo apellido can not be blank");
        //trim elimina los espacios a lado y lado
        //Validate.isTrue(value.trim().length() == 36, "Person segundo apellido can not different than 36 characters" );
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PersonSegundoApellido{" +
                "value='" + value + '\'' +
                '}';
    }
}
