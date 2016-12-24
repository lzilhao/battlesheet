/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

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

public class Protocol {
    
    static public void sendRequest(MySocket mySocket, String pedido, String request) {
        PrintWriter output;
        BufferedReader input = null;
        /*try {
            System.out.println(pedido);
            output = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()));
            output.println(pedido);
            output.println(request);
            output.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }*/
        if (pedido.contentEquals("1")) {
            mySocket.sendData(pedido);
            mySocket.sendData(request);
            System.out.println(mySocket.receiveData());
        }
    }
    
}
