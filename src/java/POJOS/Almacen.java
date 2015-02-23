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
public class Almacen {
    
    private String codalm;
    private String nomalm;
    private boolean facturaIva;
    private boolean ivaIncluido;

    public Almacen(String codalm, String nomalm, boolean facturaIva, boolean ivaIncluido) {
        this.codalm = codalm;
        this.nomalm = nomalm;
        this.facturaIva = facturaIva;
        this.ivaIncluido = ivaIncluido;
    }

    public Almacen() {
    }
    
    

    public String getCodalm() {
        return codalm;
    }

    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }

    public String getNomalm() {
        return nomalm;
    }

    public void setNomalm(String nomalm) {
        this.nomalm = nomalm;
    }

    public boolean isFacturaIva() {
        return facturaIva;
    }

    public void setFacturaIva(boolean facturaIva) {
        this.facturaIva = facturaIva;
    }

    public boolean isIvaIncluido() {
        return ivaIncluido;
    }

    public void setIvaIncluido(boolean ivaIncluido) {
        this.ivaIncluido = ivaIncluido;
    }
    
    
}
