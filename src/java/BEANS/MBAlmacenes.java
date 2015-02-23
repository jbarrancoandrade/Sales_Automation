/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEANS;

import Conection.DB;
import DAO.Dao_Almacen;
import POJOS.Almacen;
import POJOS.Cliente;
import POJOS.Listas_precios;
import POJOS.inventario;
import java.io.Serializable;
import java.sql.Connection;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Aldrin Ronco
 */
@ManagedBean
@ViewScoped
public class MBAlmacenes implements Serializable{
    
    private Almacen almacen;
    private List<Almacen> listAlm;
    private List<Listas_precios> listaPrecios;
    private Connection conexion;
    private Dao_Almacen dao_Almacen;
    
    private inventario inv;
    private List<inventario> listInventario;
    

    /**
     * Creates a new instance of MBAlmacenes
     */
    public MBAlmacenes() {
        almacen = new Almacen();
        dao_Almacen = new Dao_Almacen();
        Inventarios("001");
       
    }
    
    /**
     * 
     * @return 
     */
     public List<Almacen> allstores() {
       
        try {
            conexion = DB.GetConnection();
            listAlm = dao_Almacen.all_stores(conexion);
           
            conexion.close();
           
          
        } catch (Exception ex) {
            System.err.println("Fallo Al intentar Listar almacenes");
        }
        
        return listAlm;
       
    }
     
     /**
      * listas de precios pasar almacen
      * @param codalm
      * @return 
      */
     public List<Listas_precios> List_prices(String codalm) {
       
        try {
            conexion = DB.GetConnection();
            listaPrecios = dao_Almacen.price_lists(conexion, codalm);
           
           
            conexion.close();
           
          
        } catch (Exception ex) {
            System.err.println("Fallo Al intentar Listar precios");
        }
        
        return listaPrecios;
       
    }
     
     
      public List<inventario> Inventarios(String Codalm) {
      
        try {
            conexion = DB.GetConnection();
            listInventario= dao_Almacen.consultainventario(conexion, Codalm);
            
            conexion.close();
            for (inventario item: listInventario) {
                System.out.println("item "+ item.getNomins());
            }
            
        } catch (Exception ex) {
            
        }
        return listInventario;
    }
    
   
    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public List<Almacen> getListAlm() {
        return listAlm;
    }

    public void setListAlm(List<Almacen> listAlm) {
        this.listAlm = listAlm;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Dao_Almacen getDao_Almacen() {
        return dao_Almacen;
    }

    public void setDao_Almacen(Dao_Almacen dao_Almacen) {
        this.dao_Almacen = dao_Almacen;
    }
    
    
    
}
