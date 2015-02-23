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
public class Lineas {
     private String codlinea;
     private char clase;
     private String nomlinea;

    public Lineas(String codlinea, char clase, String nomlinea) {
        this.codlinea = codlinea;
        this.clase = clase;
        this.nomlinea = nomlinea;
    }

    public Lineas() {
    }

    public String getCodlinea() {
        return codlinea;
    }

    public void setCodlinea(String codlinea) {
        this.codlinea = codlinea;
    }

    public char getClase() {
        return clase;
    }

    public void setClase(char clase) {
        this.clase = clase;
    }

    public String getNomlinea() {
        return nomlinea;
    }

    public void setNomlinea(String nomlinea) {
        this.nomlinea = nomlinea;
    }
     
     
     
}
