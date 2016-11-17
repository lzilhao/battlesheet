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
 *
 * @author Joao-Pc
 */
public class MySocket {
    
    Connect c = new Connect();
    Socket socket;
    BufferedReader read;
    PrintWriter output;

    public void startClient(int pedido ,String username, String password) throws UnknownHostException, IOException{
        //Cria a conexão Socket
        
        
        //socket = new Socket(c.gethostName(), c.getPort());
        socket = new Socket("gnomo.fe.up.pt", 9090);
        
        //cria printwriter para enviar a informação para o server
        output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        //envia qual o tipo de pedido para o servidor
        output.println(pedido);
        //envia o username para o servidor
        output.println(username);
        //send password to server
        output.println(password);
        output.flush();

        //cria Buffered reader para ler a resposta do server
        read = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //lê a resposta do server
        String response = read.readLine();
        System.out.println("This is the response: " + response);
        //lógica de redireccionamento para a página seguinte caso os dados estejam corretos
        //ou mensagem de rro de login Failed
        //display response
        JOptionPane.showMessageDialog(null, response);
    }

    
}
