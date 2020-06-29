/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.StringTokenizer;
import javafx.scene.Node;
import javafx.scene.shape.Circle;

/**
 *
 * @author senho
 */
public class Player implements Runnable {
    private String nome;
    private Circle circuloAtual;
    private int posX, posY;
    final DataInputStream dis;
    final DataOutputStream dos;
    boolean isLoogedIn;
    Socket s;
    public Player(String nome, Circle circuloAtual, int posX, int posY,DataInputStream dis,DataOutputStream dos, Socket s){
        this.nome = nome;
        this.circuloAtual = circuloAtual;
        this.posX = posX;
        this.posY = posY;
        this.dis = dis;
        this.dos = dos;
        isLoogedIn = true;
        this.s = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Circle getCirculoAtual() {
        return circuloAtual;
    }

    public void setCirculoAtual(Circle circuloAtual) {
        this.circuloAtual = circuloAtual;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    Circle playerLook() {
        
        
        return circuloAtual;
        }

    @Override
    public void run() {
    String recebido;
    while(true){
        try{
            recebido = dis.readUTF();
            System.out.println(recebido);
            if(recebido.endsWith("logout")){
                this.isLoogedIn = false;
                this.s.close();
                
            }
            
            StringTokenizer st = new StringTokenizer(recebido,"#");
            String MsgEnviar = st.nextToken(); 
            String recepiente = null;
            try{
                recepiente = st.nextToken();
            }catch(Exception e){
            
            }
            if(recepiente != null){
                for(Player p : FXMLDocumentController.ar){
                    if(p.getNome().equals(recepiente) && p.isLoogedIn){
                        p.dos.writeUTF( nome + " : " + MsgEnviar);
                        
                    }
                }
                
            } else{
                for(Player p : FXMLDocumentController.ar){
                    if(!p.getNome().equals(recepiente) && p.isLoogedIn){
                        p.dos.writeUTF( nome + " : " + MsgEnviar);
                        
                    }
                }
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    }

 

  
    
    
}
