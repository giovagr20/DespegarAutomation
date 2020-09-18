package com.co.despegar.automation.model;

public class WhoTravelModel {

    private String nombres;
    private String apellidos;
    private String pais;
    private String numeroDocumento;
    private String dia;
    private String mes;
    private String ano;

    public WhoTravelModel(String nombres, String apellidos, String pais, String numeroDocumento, String dia, String mes, String ano) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.pais = pais;
        this.numeroDocumento = numeroDocumento;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getAno() {
        return ano;
    }
}