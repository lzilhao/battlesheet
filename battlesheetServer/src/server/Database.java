/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author luis
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author Joao-Pc
 */
public class Database {
    static public int Register(String utilizador, String senha) {
        //PreparedStatement stmt = null;
        Scanner input = new Scanner(System.in);
        ResultSet rs = null;
        int nivel=-1;
        try { 
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
// Connect to the database
            String user = "lpro1622";
            String password = "D!2240xqx";
            String url = "jdbc:postgresql://dbm.fe.up.pt/lpro1622";
            Connection conn = null;
            try { 
                conn = DriverManager.getConnection( url, user, password); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                //String cmd = "INSERT INTO USERS (username, password, age) VALUES ('" + utilizador + "','" + senha + "', '-1' );";
                //String cmd = "INSERT INTO USERS (USERNAME, NAME, AGE, PASSWORD) VALUES ('lzilhao', 'Luis Zilhao', 22, 'things');";
                String cmd = "INSERT INTO USERS(USERNAME, PASSWORD) VALUES (?,?)";
                PreparedStatement stmt = conn.prepareStatement (cmd);
                
                String username = utilizador;
                stmt.setString(1, username);
                password = senha;
                stmt.setString(2, password);
                //stmt.setInt(3, nivel);
                stmt.executeUpdate();
                stmt.close();
            }  
            /*catch (Exception e){ 
                 e.printStackTrace(); 
            }*/
            catch (org.postgresql.util.PSQLException e1){
                e1.printStackTrace();
                return -1;
            }
            catch (SQLException e2){
                e2.printStackTrace();
                return -2;
            }
            return 1;
    }
    static public Boolean Login(String argUser, String argPassword) {
        Statement stmt = null;
        ResultSet rs = null;
        String user;
        String password=null;
        int nivel=-1;
        try { 
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
        }
// Connect to the database
        Connection conn = null;
        try { 
            conn = DriverManager.getConnection( "jdbc:postgresql://dbm.fe.up.pt/lpro1622", "lpro1622", "D!2240xqx"); 
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users WHERE username='" + argUser + "';" );
            while(rs.next()){
                user = rs.getString("username");
                password = rs.getString("password");
            }
            rs.close();
            stmt.close();
            conn.close();
            if (password == null){
                return false;
            }
            else if (password.contentEquals(argPassword)){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    //return (nivel ==-1 ? false : true);
    }
    static public Boolean getUser(String argUser) {
        Statement stmt = null;
        ResultSet rs = null;
        String user = null;
        try { 
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
        }
// Connect to the database
        Connection conn = null;
        try { 
            conn = DriverManager.getConnection( "jdbc:postgresql://dbm.fe.up.pt/lpro1622", "lpro1622", "D!2240xqx"); 
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users WHERE username='" + argUser + "';" );
            while(rs.next()){
                user = rs.getString("username");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (user.contentEquals(argUser)){
            return true;
        }
        return false;
    //return (nivel ==-1 ? false : true);
    }
    
    public void UpdateVictory(String utilizador){
        Statement stmt = null;
        ResultSet rs = null;
        int victories ;
        try { 
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
        }
// Connect to the database
        Connection conn = null;
        try { 
            conn = DriverManager.getConnection( "jdbc:postgresql://dbm.fe.up.pt/lpro1622", "lpro1622", "D!2240xqx"); 
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM users WHERE username='" + utilizador + "';" );
            rs.next();
                victories = rs.getInt("victories");
                victories++;
                        
            rs = stmt.executeQuery("UPDATE users SET victories='" + victories + "'WHERE username='" + utilizador + "';" );
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
    }
    public void GetRank(){
        Statement stmt = null;
        ResultSet rs = null;
        int victories ;
        try { 
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
        }
// Connect to the database
        Connection conn = null;
        try { 
            conn = DriverManager.getConnection( "jdbc:postgresql://dbm.fe.up.pt/lpro1622", "lpro1622", "D!2240xqx"); 
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT users,victories FROM users ORDER By victories DESC;" );
            rs.next();
               
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
            
    }
    
}
