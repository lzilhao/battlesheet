/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

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
import java.sql.SQLException;
import java.util.Arrays;

public class Protocol {
    static public void processRequest( String tipo_pedido, String request,PrintWriter out) {
        PrintWriter output;
        String[] args;
        String resp;
        if (tipo_pedido.contentEquals("1")) { //Registo
            args = request.split("/");
            /*int regValue;
            System.out.println(args[0] + "/" + args[1]);
            regValue = Register.Registo(args[0], args[1]);
            if(regValue == 1){
                out.println("OMG YAY");
            }
            else if (regValue == -2) {
                out.println("WARNING: SOMETHING SOMETHING SOMETHING DATABASE ERROR");
            }*/
            out.println(tipo_pedido+":"+request);
            out.flush();
            
            System.out.println("User registered");
        }
        else if (tipo_pedido.contentEquals("2")) { //Login
            args = request.split("/");
           // ChecksCredentials. VerificaCredenciais(args[0], args[1]);
            System.out.println("Login");
            //out.println(tipo_pedido+":"+Database.Login(args[0], args[1]));
            //System.out.println("user: "+args[0]+"\npass: "+args[1]);
            out.println(tipo_pedido+":"+request);
            out.flush();
            //out.println("OMG YAY");
        }
        else if(tipo_pedido.contentEquals("11"))
        {
            args=request.split("/");
            System.out.println("x: "+args[0]+"\ny: "+args[1]);
            out.println(tipo_pedido+":"+request);
           // resp=args[0]+"/"+args[1];
          //  out.println(request);
           // server.sendData(args[1]);
            out.flush();
        }
        else if(tipo_pedido.contentEquals("10"))
        {
            System.out.println("INICIO DE JOGO");
            out.println(tipo_pedido+":lol");
            out.flush();
           // resp="Bye.";
           // out.println(resp);
            
        }
        else if(tipo_pedido.contentEquals("14"))
        {
            System.out.println("FINAL DEJOGO");
            out.println(tipo_pedido+":ll");
            out.flush();
            
        }
        else if(tipo_pedido.contentEquals("17"))
        {
            System.out.println("CONFIRMAO");
            out.println(tipo_pedido+":"+request);
            out.flush();
        }
        else if(tipo_pedido.contentEquals("15"))
        {
            System.out.println("CONFIRMAO");
            out.println(tipo_pedido+":"+request);
            out.flush();
           // out.println(request);
          //  out.print("");
         //   out.flush();
       //     System.out.print(request);
         //   System.out.print("----");
            System.out.println("CONFIRMAO2"); 
            
        }
        else if(tipo_pedido.contentEquals("16"))
        {
            System.out.println("AGUA");
            out.println(tipo_pedido+":ll");
            System.out.print("lixooooooooo");
            out.flush();
        }
        else if(tipo_pedido.contentEquals("13"))
        {
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("12"))
        {
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("20"))
        {
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("18"))
        {
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("19"))
        {
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("31"))
        {
          
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("32"))
        {
            
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("33"))
        {
            
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("34"))
        {
            
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("35"))
        {
            
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("36"))
        {
            
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("23"))
        {
            
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        else if(tipo_pedido.contentEquals("23"))
        {
            
            System.out.println(tipo_pedido+":"+request);
            out.println(tipo_pedido+":"+request);
        }
        
       
    }
    
}
