/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Roger Simanjuntak
 */
public class koneksibos {
    private Connection connection ;
     
     public Connection setConnection() 
    {
        try
        {
        String url = "jdbc:mysql://localhost:3306/atmdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String pass = "";
        
///            String url ="jdbc:sqlserver://LAPTOP-DO9BQH44;databaseName=ATM";   
///            String user ="sa";
///            String pass = "12345"; // terserah kamu aja 
            
               Class.forName("com.mysql.jdbc.Driver"); // mysql package
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("berhasil konek ke database");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error "+e.getMessage());
        }
        return connection;
       }
}
