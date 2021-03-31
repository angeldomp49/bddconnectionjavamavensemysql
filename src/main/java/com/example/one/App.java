package com.example.one;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
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

        Connection DB = null;

        String complete_url = driver_url + server_url + bd_name;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DB = DriverManager.getConnection(complete_url, "root", "");
            System.out.print("connection OK!");
            Statement bddCommand = DB.createStatement();
            ResultSet bddResponse = bddCommand.executeQuery("SELECT * FROM comments");
            ResultSetMetaData commentsMetaData = bddResponse.getMetaData();
            System.out.println("\n**********************************");

            for( int i = 1; i <= commentsMetaData.getColumnCount(); i++ ){
                System.out.print("\t" + commentsMetaData.getColumnName(i).toString() + "\t |");
            }

            System.out.println("\t****************************************");

            while( bddResponse.next() ){
                for( int i = 1; i <= commentsMetaData.getColumnCount(); i++ ){
                    System.out.print("\t" + bddResponse.getObject(i).toString() + "\t |");
                }
                System.out.println("\n---------------------------------");
            }

            bddResponse.close();
            bddCommand.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("program finished!");
        
    }
}
