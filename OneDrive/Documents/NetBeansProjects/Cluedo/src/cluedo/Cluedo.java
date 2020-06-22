/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedo;

import java.awt.Graphics;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author senho
 */
public class Cluedo extends Application {
  
    @Override
    public void start(Stage stage) throws Exception {
       
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     
        
          stage.setTitle("Cluedo");

       
          Rectangle cozinha= new Rectangle();
          Rectangle piscina= new Rectangle();
          Rectangle saladeestar= new Rectangle();
          Rectangle saladejogos= new Rectangle();
          Rectangle  saladejantar= new Rectangle();
          Rectangle libraria= new Rectangle();
          Rectangle escritorio= new Rectangle();
          Rectangle hall= new Rectangle();
          Rectangle cave= new Rectangle();
        GridPane gridPane = new GridPane();
        
        cozinha.setWidth(300);
        cozinha.setHeight(400);
         piscina.setWidth(100);
       piscina.setHeight(100);
         saladeestar.setWidth(100);
       saladeestar.setHeight(100);
        saladejogos.setWidth(100);
        saladejogos.setHeight(100);
         saladejantar.setWidth(100);
       saladejantar.setHeight(100);
         libraria.setWidth(100);
        libraria.setHeight(100);
         escritorio.setWidth(100);
       escritorio.setHeight(100);
        hall.setWidth(100);
      hall.setHeight(100);
         cave.setWidth(100);
        cave.setHeight(100);

       cozinha.setFill(Color.AQUA);
   gridPane.add(cozinha, 20,0, 1, 1);
     gridPane.add(piscina, 40,0, 1, 1);
       gridPane.add(saladeestar, 0,0, 1, 1);
         gridPane.add(saladejogos, 0,0, 1, 1);
           gridPane.add( saladejantar, 0,0, 1, 1);
             gridPane.add( libraria, 0,0, 1, 1);
               gridPane.add(escritorio, 0,0, 1, 1);
                 gridPane.add(hall, 0,0, 1, 1);
                   gridPane.add(cave, 0,0, 1, 1);
       Scene scene = new Scene(gridPane, 1900, 1000);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        launch(args);
    }
    
}
