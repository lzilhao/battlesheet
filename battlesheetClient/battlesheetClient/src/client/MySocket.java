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
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
/**
 * The MySocket class creates the socket in order to send and receive 
 * requests, such as the login, or play use cases
 * @author Joao-Pc
 */
public class MySocket {
    
    //Connect c = new Connect();
    Socket socket;
    BufferedReader input;
    PrintWriter output;
    public void startClient(){
        //Cria a conexão Socket
        
        
        //socket = new Socket(c.gethostName(), c.getPort());
        
        try {
            socket = new Socket("localhost", 9090);
        }
        catch (UnknownHostException e1) {
            e1.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }

        //cria printwriter para enviar a informação para o server
        
        
        /**************************
        output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        //envia qual o tipo de pedido para o servidor
        output.println(pedido);
        //envia o username para o servidor
        output.println(username);
        //send password to server
        output.println(password);
        output.flush();
        
        ******************************/
        /*
        //cria Buffered reader para ler a resposta do server
        read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //lê a resposta do server
        String response = read.readLine();
        System.out.println("This is the response: " + response);
        //lógica de redireccionamento para a página seguinte caso os dados estejam corretos
        //ou mensagem de rro de login Failed
        //display response
        JOptionPane.showMessageDialog(null, response);*/
    }
    public void sendData(String data) {
        
        try {
            System.out.println(data);
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
    }

    
}
