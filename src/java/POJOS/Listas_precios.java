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
public class Listas_precios {
    
     private String codList;
     private String nomList;
     private String codalm;

    public Listas_precios(String codList, String nomList, String codalm) {
        this.codList = codList;
        this.nomList = nomList;
        this.codalm = codalm;
    }

    public Listas_precios() {
    }

    
    
    public String getCodList() {
        return codList;
    }

    public void setCodList(String codList) {
        this.codList = codList;
    }

    public String getNomList() {
        return nomList;
    }

    public void setNomList(String nomList) {
        this.nomList = nomList;
    }

    public String getCodalm() {
        return codalm;
    }

    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }
     
     
    
}
