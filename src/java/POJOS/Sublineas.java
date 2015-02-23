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
public class Sublineas {
     private String codLinea;
     private String codSub;
     private char clase;
     private String nomSub;

    public Sublineas(String codLinea, String codSub, char clase, String nomSub) {
        this.codLinea = codLinea;
        this.codSub = codSub;
        this.clase = clase;
        this.nomSub = nomSub;
    }

    public Sublineas() {
    }

    public String getCodLinea() {
        return codLinea;
    }

    public void setCodLinea(String codLinea) {
        this.codLinea = codLinea;
    }

    public String getCodSub() {
        return codSub;
    }

    public void setCodSub(String codSub) {
        this.codSub = codSub;
    }

    public char getClase() {
        return clase;
    }

    public void setClase(char clase) {
        this.clase = clase;
    }

    public String getNomSub() {
        return nomSub;
    }

    public void setNomSub(String nomSub) {
        this.nomSub = nomSub;
    }
     
     
     
}
