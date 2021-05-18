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
public class Player {
    private String nome;
    private Circle circuloAtual;
    private int posX, posY;
    
    boolean isLoogedIn;
    Socket s;
    public Player(String nome, Circle circuloAtual, int posX, int posY/*,DataInputStream dis,DataOutputStream dos, Socket s*/){
        this.nome = nome;
        this.circuloAtual = circuloAtual;
        this.posX = posX;
        this.posY = posY;
        
        isLoogedIn = true;
       
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

  

 

  
    
    
}
