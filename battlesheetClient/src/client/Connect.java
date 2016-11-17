/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Joao-Pc
 * Esta Class implementa as definições da ligação ao servidor
 */
public class Connect {
    private String USERNAME = "lpro1622";
    private String PASSWORD = "secreta";
    private int PORT = 9090;
    private String HOSTNAME = "localhost";

    public String getUsername(){
        return this.USERNAME;
    }

    public String getPassword(){

        return this.PASSWORD;
    }

    public int getPort(){
        return this.PORT;
    }

    public String gethostName(){
        return this.HOSTNAME;
    }
}

