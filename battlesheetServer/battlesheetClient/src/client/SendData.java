/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import static client.screen_login.client;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 *
 * @author Joao-Pc
 */
public class SendData {
     static public void Envia(int pedido, String utilizador, String senhaencriptada){
     try {
            client.startClient(pedido, utilizador, senhaencriptada);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
}
