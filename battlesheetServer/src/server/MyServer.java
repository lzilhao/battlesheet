/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the main class, handles the server side protocol and creates
 * a thread and a socket for each client
 * @author 
 * Esta Class estabelece o servidor que receberá a informação vinda dos vários 
 * clientes, abrindo uma thread 
 * para cada socket de comunicação estabelecida com os diferentes clientes, e 
 * trata de a preparar para comparação com a Base de Dados
 */
public class MyServer {

    private int ID;
    String senha;
    boolean loginIs;
    String username;
    int login = 0;
    int registo = 0;
    MD5Pwd obj =  MD5Pwd.getInstance();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyServerSocket server = new MyServerSocket();
        
        int port = 9090;
        int count = 0;
        Socket connection;
        ServerSocket serverSocket = null;
        
        server.startServer(port);
        
        try {
            
            String tipo_pedido;
            String requestFields;
            while(true){
                System.out.println("in loop");
                tipo_pedido = server.input.readLine();
                requestFields = server.input.readLine();
                Protocol.processRequest(server, tipo_pedido, requestFields);
            } 
        }
        catch (Exception e2) {
            e2.printStackTrace();
            
        }
     
    }
}

    
