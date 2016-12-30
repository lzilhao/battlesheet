/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Rafaz
 */
public class GameLogic {

    public Player play;
    public MySocket connect;
    public String resp;
    private int pause;
    
     GameLogic(Player p1, MySocket ms)
    {
        this.play=p1;
        this.connect=ms;
        pause=0;
        
    }
    
    public int processaPedido(String s,String resp)
    {
        Integer i,j;
        //String resp;
        String rp;
        String []arg;
        String pedido;
      //  System.out.println("LOOOL");
       // resp="0";
      //  while(resp.contentEquals("0"))
      //  this.resp = Protocol.getRequest(connect);
        this.resp=resp;
      //  System.out.println("RESP:"+resp);
        if(s.contentEquals("11"))
        {
            arg=this.resp.split("/");
            System.out.println("\ny:"+arg[0]+"\nx:"+arg[1]);
            play.shotsTaken[Integer.parseInt(arg[0])-1][Integer.parseInt(arg[1])-1]=1;
            i= play.boats[Integer.parseInt(arg[0])-1][Integer.parseInt(arg[1])-1];
            if(i>0)
            {
                pedido="15";
                rp=i.toString();
            //    System.out.println("ola:"+rp);
              //  System.out.println("ola:"+rp);
                Protocol.sendRequest(connect, pedido, rp);//avisa que foi acerto
            }
            else
            {
                rp="0";
                pedido="16";
                Protocol.sendRequest(connect, pedido, rp);
            }
        }
        else if(s.contentEquals("12"))//pausa
        {
           
        }
        else if(s.contentEquals("13"))//message
        {
            
        }
        else if(s.contentEquals("14"))//perdeu
        {
            pause=0;
        }
//System.out.println("\n");
      /*  for(i=0;i<10;i++)
            {
                for(j=0;j<10;j++)
                    System.out.print(play.shotsTaken[j][i]+" ");
                System.out.println("\n");
            }*/
        
        return 0;
        
    }
    
    public int testaFim()
    {
        int i,j;
        int count=0;
        
        for(i=0;i<10;i++)
        {
            for(j=0;j<10;j++)
            {
                if(play.boats[i][j]>0)
                {
                    
                    if(play.shotsTaken[i][j]==0)
                        count++;
                }
            }       

                    
        }
        return count;
    }
    
    public int hit_match()
    {
        //String resp;
        String []arg;
        arg=this.resp.split("/");
        System.out.println("y: "+arg[0]+"\nx: "+arg[1]);
        return play.boats[Integer.parseInt(arg[0])-1][Integer.parseInt(arg[1])-1];
    }
    
}
