package com.co.despegar.automation.model;

public class VouchersInformationModel {

    private String email;
    private String confirmarEmail;
    private String area;
    private String numero;

    public VouchersInformationModel(String email, String confirmarEmail, String area, String numero) {
        super();
        this.email = email;
        this.confirmarEmail = confirmarEmail;
        this.area = area;
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public String getConfirmarEmail() {
        return confirmarEmail;
    }

    public String getArea() {
        return area;
    }

    public String getNumero() {
        return numero;
    }
}
