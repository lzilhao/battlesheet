

package server;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class responsible for the Login use case, it checks the credentials sent
 * by the player with those in the database
 * @author Joao-Pc
 */
public class ChecksCredentials {
        
    static public boolean VerificaCredenciais(String utilizador, String senha) {
        PreparedStatement stmt = null;
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
        }
        try {
            String cmd = "SELECT * FROM acesso WHERE utilizador ='" + utilizador +
"' AND senha='" + senha + "';";
            stmt = (PreparedStatement) conn.prepareStatement (cmd);
        
            

            rs = stmt.executeQuery(cmd);

            //while (rs.next()) {
              //nivel = rs.getInt("nivel");  
             /*String check=(rs.getString("user_name"));

               System.out.println(check);


               if(check.equals(username)){

                    Util.showErrorMessageDialog("EQUAL");

               }else{

                         Util.showErrorMessageDialog("NOT EQUAL");*/
            //}
        }

        catch (Exception e){ 
             e.printStackTrace(); 
        }

        return (nivel ==-1 ? false : true);

    }
}
    

