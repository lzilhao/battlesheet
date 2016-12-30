/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import com.sun.corba.se.impl.orbutil.concurrent.Mutex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rafaz
 */
public class Game {

static public int gameid=0;
//public Player host;
//public Player guest;
public int timer_host=0;
public int timer_guest=0;
public Socket from;
public Socket to;
public boolean criado=false;
BufferedReader input;
PrintWriter output;
Mutex mut;
String host;
public Game(Socket from,Socket to,Mutex mut) throws IOException
{
    this.mut=mut;
    this.from=from;
    this.to=to;
    input = new BufferedReader(new InputStreamReader(to.getInputStream()));
    output = new PrintWriter(to.getOutputStream(), true);
    criado=true;
    
}

    /**
     *
     * @param s
     */
    public void sendMessage(String pedido,String data)
{
    try {
        mut.acquire();
    } catch (InterruptedException ex) {
        Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
    }
    Protocol.processRequest( pedido, data, this.output);
    mut.release();
    
    //output.flush();
}
public void setHostName(String s)
{
    this.host=s;
}
public String getMessage(String s) throws IOException
{
    
    return input.readLine();
    
}
/*public void shoot(int from,int to,int x,int y) 
{
    if(from==host.id)//falta enviar o tiro para o destino, receber a resposta e enviar a resposta à origem
    {
        host.shotsMade[x][y]=host.shotCount;
        guest.shotsTaken[x][y]=host.shotCount;
        host.shotCount++;
        
    }
    else if(from==guest.id)
    {
        guest.shotsMade[x][y]=guest.shotCount;
        host.shotsTaken[x][y]=guest.shotCount;
        guest.shotCount++; 
    }
    
}

public int pause(int from)
{
    if((from==guest.id) && (timer_guest==0))
    {
        timer_guest=1;
        return 1;
    }
    else if((from==host.id) && (timer_host==0))
    {
        timer_host=1;
        return 1;
    }
    else
        return 0;
}

public void set_timer()
{
    long startTime = System.currentTimeMillis();
    long elapsedTime = 0;

    while (elapsedTime < 2*60*1000) {
    elapsedTime = (new Date()).getTime() - startTime;
}*/

//}
}
