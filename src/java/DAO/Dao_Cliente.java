/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldrin Ronco
 */
public class Dao_Cliente implements INTERFACE.Clientes {

    @Override
    public List<Cliente> allcustomers(Connection conexion) throws Exception {
        List<Cliente> listaClient = new ArrayList<Cliente>();

        Statement statement;
        ResultSet resultSet;

        String query = "SELECT  Ven_Clientes.Cedula,Ven_Clientes.Direccion,Ven_Clientes.NOMBRE_COM,Ven_Clientes.NOMBRE_BUS,Ven_Clientes.TELS,Ven_Clientes.CodVen,Ven_Clientes.CodZona\n"
                + "FROM Ven_Clientes \n"
                + "order by NOMBRE_BUS";

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);

        Cliente cliente;
        while (resultSet.next()) {
            cliente = new Cliente();

            cliente.setCedula(resultSet.getString("Cedula"));
            cliente.setDireccion(resultSet.getString("Direccion"));
            cliente.setNombreCom(resultSet.getString("NOMBRE_COM"));
            cliente.setNombreBus(resultSet.getString("NOMBRE_BUS"));
            cliente.setCedula(resultSet.getString("TELS"));
            cliente.setCedula(resultSet.getString("CodVen"));
            cliente.setCedula(resultSet.getString("CodZona"));

            listaClient.add(cliente);
        }

        resultSet.close();
        statement.close();

        return listaClient;
    }

    @Override
    public List<Cliente> searchcustomers(Connection conexion, String parameter) throws Exception {
        List<Cliente> listaClient = new ArrayList<Cliente>();

        Statement statement;
        ResultSet resultSet;
        parameter = parameter.replaceAll("", "%");
        String query = "SELECT  Ven_Clientes.Cedula,Ven_Clientes.Direccion,Ven_Clientes.NOMBRE_COM,Ven_Clientes.NOMBRE_BUS,Ven_Clientes.TELS,Ven_Clientes.CodVen,Ven_Clientes.CodZona\n"
                + "FROM Ven_Clientes \n"
                + "where Ven_Clientes.NOMBRE_BUS like ('%"+parameter+"%') or Ven_Clientes.TELS like ('%"+parameter+"%') or Ven_Clientes.Direccion like ('%"+parameter+"%')\n"
                + "order by NOMBRE_BUS";

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);

        Cliente cliente;
        while (resultSet.next()) {
            cliente = new Cliente();

            cliente.setCedula(resultSet.getString("Cedula"));
            cliente.setDireccion(resultSet.getString("Direccion"));
            cliente.setNombreCom(resultSet.getString("NOMBRE_COM"));
            cliente.setNombreBus(resultSet.getString("NOMBRE_BUS"));
            cliente.setCedula(resultSet.getString("TELS"));
            cliente.setCedula(resultSet.getString("CodVen"));
            cliente.setCedula(resultSet.getString("CodZona"));

            listaClient.add(cliente);
        }

        resultSet.close();
        statement.close();

        return listaClient;

    }

}
