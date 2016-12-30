/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import com.sun.corba.se.impl.orbutil.concurrent.Mutex;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafaz
 */
public class MyThread extends Thread {
    public Socket socket;
    BufferedReader input;
    PrintWriter output;
    int jogar=0;
    Game jogo;
    int flag;
    Integer l;
    int host;
    Mutex mut;
    Mutex listMut;
    Player p1;
    static List <SocketList> lista = new ArrayList<>();
    static List <ActiveSockets> listaAct = new ArrayList<>();
    boolean nalista;

    public MyThread(Socket clientSocket,List <SocketList> sockList,List<ActiveSockets> ls,Mutex mutx) {
        this.socket = clientSocket;
        this.lista=sockList;
        nalista=false;
        this.listaAct=ls;
        l=1;
        flag=0;
        mut=new Mutex();
        this.listMut=mutx;
       try
        {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }

    public void run() {
        int i;
        int up=0;
        int j;
        String []a;
        try {
            
            String tipo_pedido;
            String requestFields;
            while(true){
               
                tipo_pedido = input.readLine();
                requestFields = input.readLine(); 
                 if(up==1)
                 {System.out.println("in loop"+p1.name);
                System.out.println("--\n"+tipo_pedido+"\n--"+p1.name);
                 }
                if(tipo_pedido.contentEquals("2"))
                {
                    a=requestFields.split("/");
                    p1=new Player(1,a[0]);
                    System.out.println("Login");
                    listMut.acquire();
                    listaAct.add(new ActiveSockets(socket,p1.name,mut));
                    listMut.release();
                    up=1;
                }
                else if(tipo_pedido.contentEquals("30"))
                {
                    i=0; 
                    while(i<lista.size())
                     {
                         mut.acquire();
                         System.out.println("Vai: "+i);
                         listMut.acquire();
                         Protocol.processRequest("31", lista.get(i).getHostName(), output);
                         listMut.release();
                         while(!tipo_pedido.contentEquals("5"))
                         tipo_pedido = input.readLine();
                         requestFields = input.readLine();
                         tipo_pedido="0";
                         mut.release();
                         i++;
                     }
                   // Protocol.processRequest("31", requestFields, output);
                }
                else if(tipo_pedido.contentEquals("20"))//pedido para mensagem geral
                {
                    
                   
                   //for(i=0;(i<listaAct.size()) && (listaAct.get(i).);i++)
                    i=0;
                    listMut.acquire();
                    while((i<listaAct.size()) && !(listaAct.get(i).getName().contentEquals("1")))
                     {
                         i++;
                     }
                    System.out.println("INDICE: "+i);
                        listaAct.get(i).sendMessage(requestFields);
                    listMut.release();
                }
               
                else  if(tipo_pedido.contentEquals("8"))//pedido para criar servidor
                {
                    System.out.println("Crou servidor de jogo");
                     host=1;
                     listMut.acquire();
                    lista.add(new SocketList(p1.id,socket,p1.name));
                    listMut.release();
                   // jogar=1;
                    flag=1;
                    nalista=true;
                    
                }
                else  if(tipo_pedido.contentEquals("4"))
                {
                    i=0;
                        if(flag==1)
                        {
                            listMut.acquire();
                            while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(p1.name)))
                            {
                                i++;
                            }
                            if(i<lista.size())
                            lista.remove(i);
                            listMut.release();
                        }
                }
                else if(tipo_pedido.contentEquals("9"))//pedido para entrar em servidor
                {
                    
                    host=0;
                    jogar=1;
                    flag=0;
                    i=0; 
                  //  System.out.println("Content: "+lista.get(0).getHostName());
                    listMut.acquire();
                            while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(requestFields)))
                             {
                                 i++;
                          //       System.out.println("Indice: "+i);
                             }
                       listMut.release();
                             j=0; 
                             listMut.acquire();
                        while((j<listaAct.size()) && !(listaAct.get(j).getName().contentEquals( requestFields )))
                         {
                             j++;
                         }
                 //   System.out.println("Host indice: "+i);
                    //System.out.println("Host indice total: "+j);
                    lista.get(i).setGuest(socket);
                    lista.get(i).setGuestName(p1.name);
                    jogo=new Game(socket,lista.get(i).getHost(),listaAct.get(j).mut);
                    listMut.release();
                  //  System.out.println("--\n"+jogar+"\n--");
                    mut.acquire();
                    listMut.acquire();
                    Protocol.processRequest("32", lista.get(i).getHostName(), output);
                  //  jogo.sendMessage("10", "dum");
                    listMut.release();
                    mut.release();
                    
                }
                else if((tipo_pedido.contentEquals("10")) && (flag==1))
                {
                    jogar=1;
                }
                while(jogar==1)
                {
                    if(flag==1)
                    {
                        
                        i=0; 
                        listMut.acquire();
                            while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(p1.name)))
                             {
                                 i++;
                             }
                             
                         //     System.out.println("Content: "+lista.get(i).getHostName());
                            System.out.println("Host indice: "+i);
                              System.out.println("Content2: "+lista.get(i).getGuestName());
                             listMut.release();
                             listMut.acquire(); 
                             j=0;
                        while((j<listaAct.size()) && !(listaAct.get(j).getName().contentEquals( lista.get(i).getGuestName() )))
                         {
                             j++;
                         }
                           
                        jogo=new Game(socket,lista.get(i).getGuest(),listaAct.get(j).mut); 
                        listMut.release();
                        flag=0;
                       jogo.setHostName(p1.name);
                        jogo.sendMessage("10", "dum");
                        System.out.println("Jogo inicializado");
                         i=0;
                        if(host==1)
                        {
                            listMut.acquire();
                            while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(jogo.host)))
                            {
                                i++;
                            }
                            if(i<lista.size())
                            lista.remove(i);
                            listMut.release();
                        }
                        
                    }
                    System.out.println("in loop2 "+p1.name);
                    tipo_pedido = input.readLine();
                    requestFields = input.readLine();
                     System.out.println("--\n"+tipo_pedido+"\n--");
                    System.out.println("rqst: "+requestFields);
                    jogo.sendMessage(tipo_pedido,requestFields);
                    //jogo.sendMessage(requestFields);
                    System.out.println("--\n"+tipo_pedido+"\n--");
                    if(tipo_pedido.contentEquals("14"))
                    {
                        jogar=0;
                        jogo.sendMessage("14", "lol");
                        i=0;
                        if(host==1)
                        {
                            listMut.acquire();
                            while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(jogo.host)))
                            {
                                i++;
                            }
                            if(i<lista.size())
                            lista.remove(i); 
                            listMut.release();
                        }
                       flag=0;
                    }
                    if(tipo_pedido.contentEquals("17"))//vitoria
                    {
                        
                        jogar=0;
                         i=0;
                         jogo.sendMessage("17", "win");
                        if(host==1)
                        {
                            listMut.acquire();
                            while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(jogo.host)))
                            {
                                i++;
                            }
                            if(i<lista.size())
                            lista.remove(i);
                            listMut.release();
                        }
                        flag=0;
                        
                    }
                    else if(tipo_pedido.contentEquals("24"))//kickar
                    {
                        
                        jogar=0;
                         i=0;
                        if(host==1)
                        {
                            while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(jogo.host)))
                            {
                                i++;
                            }
                          //  jogo.sendMessage("24", tipo_pedido);
                            if(i<lista.size())
                                lista.remove(i);
                        }
                         host=1;
                        lista.add(new SocketList(p1.id,socket,p1.name));
                        jogar=0;
                   // jogar=1;
                        flag=1;
                        
                        
                    }
                    
                }
                
               // Protocol.processRequest(socket, tipo_pedido, requestFields,output);
            } 
        }
        catch (Exception e2) {
            e2.printStackTrace();
            System.out.println("ERRO");
             i=0; 
            try {
                listMut.acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
                    while((i<listaAct.size()) && !(listaAct.get(i).getName().contentEquals(p1.name)))
                     {
                         i++;
                     }
                    System.out.println("INDICE: "+i);
                    listaAct.remove(i);
                   i=0; 
                  if((nalista) && (host==1))
                   {    
                        while((i<lista.size()) && !(lista.get(i).getHostName().contentEquals(p1.name)))
                        {
                            i++;
                        }
                        if(i<lista.size())
                        lista.remove(i);
                        for(i=0;i<lista.size();i++)
                            System.out.println("Nome dos hosts: "+lista.get(i).getHostName()+"---> Indice:"+i);
                   }
                  listMut.release();
                 
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("aqui");

    }
}
