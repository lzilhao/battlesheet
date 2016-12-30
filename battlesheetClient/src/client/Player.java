/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

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
    public int [][]boats=new int[10][10];
    public int [][]shotsMade=new int[10][10];
    public int [][]shotsTaken=new int[10][10];
    
    public Player(int id1,String name1)
    {
                this.id=id1;
                this.name=name1;
    }
    public void clearMatrix()
    {
        int i,j;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                boats[i][j]=0;
                shotsMade[i][j]=0;
                shotsTaken[i][j]=0;
            }
        }
    }
    public void getBoats(int [][]b)
    {
        int i,j;
        this.boats=b;
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(b[i][j]>0)
                    this.boats[i][j]=b[i][j];
                else
                    this.boats[i][j]=0;
                
              //  System.out.print(boats[i][j]+" ");
            }
           // System.out.print("\n");
        }
    }
            
}

