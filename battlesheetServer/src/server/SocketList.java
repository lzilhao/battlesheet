/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.Socket;

/**
 *
 * @author Rafaz
 */
public class SocketList {
 
    private Socket host;
    private Socket guest;
    private String hostn;
    private int id;
    private String guestn;
 
    public SocketList(int id,Socket host,String hosn) {
        this.host = host;
        this.id = id;
        this.guest=guest;
        this.hostn=hosn;
    }
    public SocketList(int id,Socket host) {
        this.host = host;
        this.id = id;
        
    }
    public void setHost(Socket host,int id) { this.host = host;
                                            this.id= id;}
    public void setGuest(Socket guest) { this.guest = guest; }
    public void setGuestName(String g){this.guestn=g;}
    public Socket getHost()   { return host; }
    public Socket getGuest() { return guest; }
    public String getHostName(){return hostn;}
    public int getHostId(){ return id;}
    public String getGuestName(){return guestn;}
}
