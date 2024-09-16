package com.example.RestClient.model;

import org.apache.commons.lang3.Validate;

public class PersonIdType {

    private final String value;

    public PersonIdType(String value) {
        Validate.notNull(value, "Person IdType can not be blank");
        //trim elimina los espacios a lado y lado
        Validate.isTrue(value.trim().length() == 36, "Person IdType can not different than 36 characters" );
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PersonIdType{" +
                "value='" + value + '\'' +
                '}';
    }
}
