/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACE;

import DAO.Dao_Cliente;
import POJOS.Cliente;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Aldrin Ronco
 */
public interface Clientes {
    
    /**
     * List customers 
     * @param conexion
     * @return
     * @throws Exception 
     */
    public List<Cliente> allcustomers(Connection conexion)throws Exception;
    
    /**
     * search for nit,nombre,dirreccion, telefono
     * @param conexion
     * @param parameter
     * @return
     * @throws Exception 
     */
    public List<Cliente> searchcustomers(Connection conexion,String parameter)throws Exception;
   
    
    
}
