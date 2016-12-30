/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rafaz
 */
public class ActiveSockets {
    Socket sock;
    String name;
    PrintWriter output;
    Mutex mut;
    ActiveSockets (Socket sock,String name,Mutex mut)
    {
        this.mut=mut;
        this.sock=sock;
        this.name=name;
        try {
            output = new PrintWriter(sock.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ActiveSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sendMessage(String data)
    {
        try {
            mut.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(ActiveSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
        Protocol.processRequest("20", data,this.output);
        mut.release();
    }
    public String getName()
    {
        return name;
    }
    
    
}
