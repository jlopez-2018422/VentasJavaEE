package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBJavaEEVentas2018422?useSSL=false", "root", "admin");
        }catch(Exception e){
            e.printStackTrace();    
            System.out.println("No se pudo conectar con la base de datos");
        }
        return conexion;
        
    }
}
