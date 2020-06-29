/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author senho
 */
public class FXMLDocumentController implements Initializable {
    Player player;;
    DirecaoAndar dA;
   static Vector <Player> ar = new Vector<>();
    static int i = 0;
    @FXML
    private Label label;
    @FXML
    private GridPane tabuleiro ;
     
    @FXML
    private Rectangle cozinha;
    @FXML
    private Rectangle salajantar;
    @FXML
    private Rectangle biblioteca;
    @FXML
    private Rectangle casabanho;
    @FXML
    private Rectangle salajogos;
    @FXML
    private Rectangle armazem;
    @FXML
    private Rectangle hall;
    @FXML
    private Rectangle salaestar;
    @FXML
    private Rectangle scarletcasa;
    @FXML
    private Rectangle mustardcasa;
    @FXML
    private Rectangle plumcasa;
    @FXML
    private Rectangle whitecasa;
    @FXML
    private Rectangle greencasa;
    @FXML
    private Rectangle peacockcasa;
    @FXML
    private Circle scarlet;
    @FXML
    private Circle mustard;
    @FXML
    private Circle plum;
    @FXML
    private Circle green;
    @FXML
    private Circle white;
    @FXML
    private Circle peacock;
    @FXML
    public Button botaoRodarDado;
    @FXML
    private Button botaoBoato;
    @FXML
    private Rectangle corDoPersonagem;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
       gereDado();
        
         Alert dialogoInfo  = new Alert(Alert.AlertType.INFORMATION);
           
            dialogoInfo.setContentText(" O Servidor aceita conexões");
          
            dialogoInfo.showAndWait();
            try{
           ServerSocket ss = new ServerSocket();
            Socket s;
            
            while(true){
                s = ss.accept();
                dialogoInfo.setContentText("Novo Cliente conectado" + s);
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
              
                if(i == 1){
                Player p1 = new Player("Cliente " + i,scarlet,(int)scarletcasa.getX(),(int)scarletcasa.getY(),dis,dos,s);
                Thread t = new Thread(p1);
                ar.add(p1);
                t.start();
                }
                else if( i == 2){
                    Player p2 = new Player("Cliente " + i,plum,(int)plumcasa.getX(),(int)plumcasa.getY(),dis,dos,s);
                Thread t = new Thread(p2);
                ar.add(p2);
                t.start();
                }
                
                i++;
                
            }}catch(IOException e){
                
            }
       
               
          
     
        
    }   
    
    /**
     *
     * 
     * Método que faz a implementação da movimentação de cada jogador
     */
    public void moveJogador(Player atual){
        int proximaCasa;
        int contaCasasParaAndar = 0;
        
          
    }
     
  
     public  int gereDado(){
        int x = (int) (Math.random()*6+1);
      
       botaoRodarDado.setOnAction(e ->{
           Alert dialogoInfo  = new Alert(Alert.AlertType.INFORMATION);
           
            dialogoInfo.setContentText("O número que lhe saiu foi  " + x);
          
            dialogoInfo.showAndWait();
       });
       return x;
    }
}
