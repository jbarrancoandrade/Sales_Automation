/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACE;

import POJOS.Almacen;
import POJOS.Listas_precios;
import POJOS.inventario;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Aldrin Ronco
 */
public interface Almacenes {
    
    /**
     * List all stores
     * @param conexion
     * @return
     * @throws Exception 
     */
    public List<Almacen> all_stores(Connection conexion)throws Exception;
    
    /**
     * list price
     * @param conexion
     * @param codalm
     * @return
     * @throws Exception 
     */
    public List<Listas_precios> price_lists(Connection conexion,String codalm)throws Exception;
    
    
    public List<inventario> consultainventario(Connection conexion,String codalm) throws Exception;
    
    
    
}
