/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.sql.*;

/**
 * This class creates the database and the necessary tables for the all aspects
 * of the game
 * @author luis
 */
public class CreateDatabase {

    /**
     * @param args the command line arguments
     */
    public  CreateDatabase() {
               
      Connection c = null;
      Statement stmt = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://dbm.fe.up.pt/lpro1622",
            "lpro1622", "D!2240xqx");
         System.out.println("Opened database successfully");
         
         DatabaseMetaData meta = c.getMetaData();
         ResultSet tables = meta.getTables(null, null, "users", null);
         if (tables.next()) {
            System.out.println("Table already exists");
         }
         else{
            stmt = c.createStatement();
            String sql = "CREATE TABLE USERS " +
                         "(USERNAME TEXT PRIMARY KEY     NOT NULL," +
                         " NAME           TEXT    NOT NULL, " +
                         " AGE            INT     NOT NULL, " +
                         " PASSWORD         TEXT)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
            System.out.println("Table created successfully");
         }
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }      
      
    }      
}      

