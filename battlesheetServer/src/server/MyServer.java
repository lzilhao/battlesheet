/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
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

    static final int PORT = 9090;
    static List <SocketList> lista = new ArrayList<>();
    static List <ActiveSockets> sockList= new ArrayList<>();
    static Mutex muxy;
    public static void main(String args[]) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        
        //CreateDatabase.CreateDatabase();
        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();

        }
        while (true) {
            try {
                socket = serverSocket.accept();
                muxy=new Mutex();
               // lista.add(socket);
            } catch (IOException e) {
                System.out.println("I/O error: " + e);
            }
            // new threa for a client
           // sockList.add(new ActiveSockets(socket));
            new MyThread(socket,lista,sockList,muxy).start();
            System.out.println("Thread começa");
        }
        
    }
}

    
