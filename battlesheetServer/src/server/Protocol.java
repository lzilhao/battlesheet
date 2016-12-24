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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Protocol {
    static public void processRequest(MyServerSocket server, String tipo_pedido, String request) {
        PrintWriter output;
        String[] args;
        if (tipo_pedido.contentEquals("1")) { //Registo
            args = request.split("/");
            int status;
            System.out.println(args[0] + "/" + args[1]);
            status = Register.Registo(args[0], args[1]);
            if(status == 1){
                server.sendData("OMG YAY");
            }
            else if (status == -2) {
                server.sendData("WARNING: SOMETHING SOMETHING SOMETHING DATABASE ERROR");
            }
            
            
            
            System.out.println("User registered");
        }
        else if (tipo_pedido.contentEquals("2")) { //Login
            args = request.split("/");
            ChecksCredentials. VerificaCredenciais(args[0], args[1]);
        }

    }
    
}
