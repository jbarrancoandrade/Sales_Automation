/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJOS.Almacen;
import POJOS.Listas_precios;
import POJOS.inventario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldrin Ronco
 */
public class Dao_Almacen implements INTERFACE.Almacenes {

    @Override
    public List<Almacen> all_stores(Connection conexion) throws Exception {
        List<Almacen> listAlmacen = new ArrayList<Almacen>();

        Statement statement;
        ResultSet resultSet;

        String query = "select codalm, Nomalm,FacturaIVA,IvaIncluido\n"
                + "from Gen_Almacenes";

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);

        Almacen almacen;
        while (resultSet.next()) {
            almacen = new Almacen();

            almacen.setCodalm(resultSet.getString("codalm"));
            almacen.setNomalm(resultSet.getString("Nomalm"));
            almacen.setFacturaIva(resultSet.getBoolean("FacturaIVA"));
            almacen.setIvaIncluido(resultSet.getBoolean("IvaIncluido"));

            listAlmacen.add(almacen);
        }

        resultSet.close();
        statement.close();

        return listAlmacen;
    }

    @Override
    public List<Listas_precios> price_lists(Connection conexion, String codalm) throws Exception {
        List<Listas_precios> listas_precios = new ArrayList<Listas_precios>();

        Statement statement;
        ResultSet resultSet;

        String query = "SELECT CodList,NomList,Codalm\n"
                + "FROM Ven_ListaPrecios\n"
                + "where codalm='" + codalm + "' and ACTIVA='1'";

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);

        Listas_precios precios;
        while (resultSet.next()) {
            precios = new Listas_precios();

            precios.setCodList(resultSet.getString("CodList"));
            precios.setCodList(resultSet.getString("codalm"));
            precios.setNomList(resultSet.getString("NomList"));

            listas_precios.add(precios);
        }

        resultSet.close();
        statement.close();

        return listas_precios;

    }

    @Override
    public List<inventario> consultainventario(Connection conexion, String codalm) throws Exception {
        List<inventario> listaTProducto = new ArrayList<inventario>();
        Statement statement;
        ResultSet resultSet;

        String query = "select Alm_Insumos.Codins,nomins,refins,Ven_IVAS.MargenIva,Alm_Invent.Caninv,undIns,Alm_Invent.valInv\n"
                + "from Alm_Insumos \n"
                + "left join Ven_IVAS\n"
                + "on Ven_IVAS.CodIva=Alm_Insumos.CodIva\n"
                + "left join Alm_Invent \n"
                + "on Alm_Invent.Codins=Alm_Insumos.Codins\n"
                + "where Alm_Insumos.Activo='1' and Alm_Invent.codalm='" + codalm + "' and Alm_Invent.Caninv > 0";

        statement = (Statement) conexion.createStatement();
        resultSet = statement.executeQuery(query);

        inventario tProducto;
        while (resultSet.next()) {
            tProducto = new inventario();

            tProducto.setCodins(resultSet.getString("Codins"));
            tProducto.setNomins(resultSet.getString("nomins"));
            tProducto.setRefins(resultSet.getString("refins"));
            tProducto.setUndIns(resultSet.getString("undIns"));
            tProducto.setMargenIva(resultSet.getBigDecimal("MargenIva"));
            tProducto.setCaninv(resultSet.getBigDecimal("Caninv"));
            tProducto.setValInv(resultSet.getBigDecimal("valInv"));

            listaTProducto.add(tProducto);
        }

        resultSet.close();
        statement.close();

        return listaTProducto;

    }

}
