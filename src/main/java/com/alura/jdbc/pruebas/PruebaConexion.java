package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConectionFactory;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = new ConectionFactory().recuperaConexion();

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
