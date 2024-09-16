package com.example.RestClient.model;


public class Person {

    private final PersonId id;
    private final PersonIdType idType;
    private final PersonPrimerNombre primerNombre;
    private final PersonPrimerApellido primerApellido;
    private final PersonSegundoNombre segundoNombre;
    private final PersonSegundoApellido segundoApellido;
    private final PersonTelefono telefono;
    private final PersonDireccion direccion;
    private final PersonCiudadResidencia ciudadResidencia;

    public Person(PersonId id, PersonIdType idType, PersonPrimerNombre primerNombre, PersonPrimerApellido primerApellido, PersonSegundoNombre segundoNombre, PersonSegundoApellido segundoApellido, PersonTelefono telefono, PersonDireccion direccion, PersonCiudadResidencia ciudadResidencia ) {
        this.id = id;
        this.idType = idType;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoNombre = segundoNombre;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudadResidencia = ciudadResidencia;
    }

    public PersonId getId() {
        return id;
    }

    public PersonIdType getIdType() {
        return idType;
    }

    public PersonPrimerNombre getPrimerNombre() {
        return primerNombre;
    }

    public PersonPrimerApellido getPrimerApellido() {
        return primerApellido;
    }

    public PersonSegundoNombre getSegundoNombre() {
        return segundoNombre;
    }

    public PersonSegundoApellido getSegundoApellido() {
        return segundoApellido;
    }

    public PersonTelefono getTelefono() {
        return telefono;
    }

    public PersonDireccion getDireccion() {
        return direccion;
    }

    public PersonCiudadResidencia getCiudadResidencia() {
        return ciudadResidencia;
    }

}
