package com.co.despegar.automation.model;

public class WhoTravelModel {

    private String nombres;
    private String apellidos;
    private String pais;
    private String numeroDocumento;

    public WhoTravelModel(String nombres, String apellidos, String pais, String numeroDocumento) {
        super();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.pais = pais;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getPais() {
        return pais;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
}
