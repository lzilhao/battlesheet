/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ricardo Pereira,João Costa
 * Esta é a Class implementa um meio de comunicação com o servidor usando a Class Socket do JAVA
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import java.net.ServerSocket;

/**
 * The MySocket class creates the socket in order to send and receive 
 * requests, such as the login, or play use cases
 * @author Joao-Pc
 */
public class MyServerSocket {
    
    //Connect c = new Connect();
    Socket socket;
    BufferedReader input;
    PrintWriter output;
    ServerSocket serverSocket = null;
    
    public void startServer(int port){        
        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Listening on port " + port);
            socket = serverSocket.accept();
            output = new PrintWriter(socket.getOutputStream(), true);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
        }
        catch (IOException e1) {
            e1.printStackTrace();
        }    
        
    }
   /* public void sendData(String data) {
        
        try {
            //System.out.println(data);
            output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            output.println(data);
            output.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
    }
    public String receiveData() {
        String response;
        try {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            response = input.readLine();
            return response;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }*/

    
}
