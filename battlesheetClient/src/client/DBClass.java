
package client;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class establishes the database connection
 * @author Ricardo Pereira
 */
public class DBClass 
{
    Connection con;
    
    DBClass()
    {
        try
        {
            //Class.forName("org.postgresql.Driver");
            String database = "jdbc:postgresql://dbm.fe.up.pt/lpro1622";
            con = DriverManager.getConnection(database, "lpro1622", "D!2240xqx");
            System.out.println("Connection Passed");
        }   
        catch(Exception e)
        {
           System.out.println(e); 
        }
        
    }
}
