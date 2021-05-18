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
import java.util.Vector;
import javafx.application.Application;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

/**
 *
 * @author senho
 */
public class Clue extends Application {
     

   
    @Override
    public void start(Stage stage) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/views/FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
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
