/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue;

import java.net.URL;
import java.util.ResourceBundle;
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
        player = new Player("Murta",scarlet,0,18);
        dA = new DirecaoAndar(player,(int)scarletcasa.getX(),(int)scarletcasa.getY(),tabuleiro);
        
          if(player.getCirculoAtual()==scarlet){
              corDoPersonagem.setFill(Color.RED);
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
