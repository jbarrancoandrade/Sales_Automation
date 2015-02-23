/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEANS;

import Conection.DB;
import DAO.Dao_Cliente;
import POJOS.Cliente;
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
public class MBClientes implements Serializable {

    private Cliente cliente;
    private List<Cliente> listClient;
    private Connection conexion;
    private Dao_Cliente dao_Cliente;

    /**
     * Creates a new instance of MBClientes
     */
    public MBClientes() {
        cliente = new Cliente();
        dao_Cliente = new Dao_Cliente();
        
    }

    /**
     * Ver CLientes
     * @return 
     */
    public List<Cliente> allcustomers() {
       
        try {
            conexion = DB.GetConnection();
            listClient = dao_Cliente.allcustomers(conexion);
            conexion.close();
           
          
        } catch (Exception ex) {
            System.err.println("Fallo Al intentar Listar Clientes");
        }
        
        return listClient;
       
    }
    
    /**
     * Listar Clientes
     * @param parameter
     * @return 
     */
    public List<Cliente> searchcustomers(String parameter) {
       
        try {
            conexion = DB.GetConnection();
            listClient = dao_Cliente.searchcustomers(conexion, parameter);
            conexion.close();
            for (Cliente item : listClient) {
                System.out.println("clientes" + item.getNombreBus());
            }
          
        } catch (Exception ex) {
            System.err.println("Fallo Al intentar Listar Clientes");
        }
        
        return listClient;
       
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListClient() {
        return listClient;
    }

    public void setListClient(List<Cliente> listClient) {
        this.listClient = listClient;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Dao_Cliente getDao_Cliente() {
        return dao_Cliente;
    }

    public void setDao_Cliente(Dao_Cliente dao_Cliente) {
        this.dao_Cliente = dao_Cliente;
    }

}
