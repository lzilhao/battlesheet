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
 *
 * @author Joao-Pc
 * Esta Class estabelece o servidor que receberá a informação vinda dos vários 
 * clientes, abrindo uma thread 
 * para cada socket de comunicação estabelecida com os diferentes clientes, e 
 * trata de a preparar para comparação com a Base de Dados
 */
public class MyServer implements Runnable {
    private Socket connection;
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
        int port = 9090;
        int count = 0;
        
        try{
            ServerSocket socket1 = new ServerSocket(port);
            System.out.println("MultipleSocketServer Initialized");
        while (true) {
            Socket connection = socket1.accept();
            Runnable runnable = new MyServer(connection, ++count);
            Thread thread = new Thread(runnable);
            thread.start();
        }
        }
        catch (Exception e) {}
    }
    MyServer(Socket s, int i) {
        this.connection = s;
        this.ID = i;
    }
    @Override
    public void run() {
      
    try {
        BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String tipo_pedido = input.readLine();
        int pedido = Integer.parseInt(tipo_pedido);
        
        String username = input.readLine();
        System.out.println("SERVER SIDE username" + username);
        
        String senha_encriptada = input.readLine();
        //senha = obj.decode(username,senha_encriptada);
        System.out.println("SERVER SIDE senha_encriptada" + senha_encriptada); 
        
        if ( pedido == 2 ){
            boolean loginIs = ChecksCredentials.VerificaCredenciais(username,senha_encriptada);
            if(loginIs == true){
            login = 1;
        }
        }else {
            //System.out.println("SERVER SIDE senha" + senha); 
            Register newUser = new Register();
            registo = newUser.Registo(username,senha_encriptada);
            //registo = 1;
        }
      /*BufferedInputStream is = new BufferedInputStream(connection.getInputStream());
      InputStreamReader isr = new InputStreamReader(is);*/
      /*int character;
      StringBuffer process = new StringBuffer();
      while((character = isr.read()) != 13) {
        process.append((char)character);*/
      }catch (Exception e){
          e.printStackTrace();
      }
      /*System.out.println(process);
      //need to wait 10 seconds to pretend that we're processing something
      try {
        Thread.sleep(10000);
      }
      catch (Exception e){}
      TimeStamp = new java.util.Date().toString();
      String returnCode = "MultipleSocketServer repsonded at "+ TimeStamp + (char) 13;*/
      
        try {
            PrintWriter output = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()));
            if (registo == 1){
                output.println("Account Created");
            }
            else if (registo == -1){
                output.println("Username already exists");
            }
            /*if(login == 1){
                output.println("Welcome, " + username );
            }else {
                if(registo ==1){
                    output.println("Account Created");
                } else {
                    output.println("Login Failed");
                }
            }*/

            output.flush();

        }
        catch (Exception e) {
          System.out.println(e);
        }
        finally {
          try {
            connection.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

    
