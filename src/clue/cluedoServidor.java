/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author senho
 */
public class cluedoServidor {
    private ServerSocket serverSock;
    
    public cluedoServidor(int port) throws IOException{
        serverSock = new ServerSocket();
    }
    
    public void run() throws IOException{
        while(true){
            Socket sct = new Socket();
            
        }
    }
}
