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
public class Player {
    public int id;
    public int exp;
    public String name;
    public Socket connect;
    public int shotCount=1;
   // public int [][] boats=new int[10][10];
    public int [][]shotsMade=new int[10][10];
    public int [][]shotsTaken=new int[10][10];
    
    public Player(int id1,String name1)
    {
                this.id=id1;
                this.name=name1;
    }
            
}
