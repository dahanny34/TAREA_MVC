package com.mvc.modelo;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    String url="jdbc:mysql://localhost:3306/taller_crud";
    String user="root",pass="";    
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/taller_crud?" +
                                   "user=root&password=");
        } catch (Exception e) { 
            System.out.println("SQLException: " + e.getMessage());
        }
        return con;
    }
}
