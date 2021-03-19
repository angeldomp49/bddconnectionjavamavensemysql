package com.example.one;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String driver_url = "jdbc:mysql:";
        String server_url = "//localhost:3306";
        String bd_name = "/for_dates";

        String complete_url = driver_url + server_url + bd_name;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println( "Driver OK!" );
            DriverManager.getConnection(complete_url, "root", "");
            System.out.println("Connection OK!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("program finished!");
        
    }
}
