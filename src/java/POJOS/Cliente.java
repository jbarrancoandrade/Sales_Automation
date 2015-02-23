/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJOS;

/**
 *
 * @author Aldrin Ronco
 */
public class Cliente {
    
 private String cedula;
 private String direccion;
 private String nombreCom;
 private String tels;
 private String nombreBus;
 private String codVen;
 private String codZona;

    public Cliente(String cedula, String direccion, String nombreCom, String tels, String nombreBus, String codVen, String codZona) {
        this.cedula = cedula;
        this.direccion = direccion;
        this.nombreCom = nombreCom;
        this.tels = tels;
        this.nombreBus = nombreBus;
        this.codVen = codVen;
        this.codZona = codZona;
    }

    public Cliente() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public String getTels() {
        return tels;
    }

    public void setTels(String tels) {
        this.tels = tels;
    }

    public String getNombreBus() {
        return nombreBus;
    }

    public void setNombreBus(String nombreBus) {
        this.nombreBus = nombreBus;
    }

    public String getCodVen() {
        return codVen;
    }

    public void setCodVen(String codVen) {
        this.codVen = codVen;
    }

    public String getCodZona() {
        return codZona;
    }

    public void setCodZona(String codZona) {
        this.codZona = codZona;
    }
 
 
    
}
