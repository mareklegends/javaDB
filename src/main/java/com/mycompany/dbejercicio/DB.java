/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author marco
 */
public class DB {

    // Declaramos la conexion a mysql
//    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/mysql";
    // Funcion que va conectarse a mi bd de mysql

  
    public static Connection iniciarConnection(){   
        try {

            Connection co= DriverManager.getConnection("jdbc:mysql//localhost:3306/mysql", "root", "");
            Statement stm = co.createStatement();
            System.out.println("Conectado correctamente a la Base de Datos");
            return co;
        } catch (SQLException e) {
            System.out.println("Error de conexion: "+e);
        } catch (Exception e) {
            System.out.println("Error desconocido: "+e);
        }
            return null;
    }
    
}
