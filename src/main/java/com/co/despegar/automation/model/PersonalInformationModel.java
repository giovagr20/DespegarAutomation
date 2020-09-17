package com.co.despegar.automation.model;

public class PersonalInformationModel {

    private String banco;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String estado;
    private String ciudad;
    private String direccion;

    public PersonalInformationModel(String banco, String nombre, String apellido, String numeroDocumento, String estado, String ciudad, String direccion) {
        super();
        this.banco = banco;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.estado = estado;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getBanco() {
        return banco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
}
