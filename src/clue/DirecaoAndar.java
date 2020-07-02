/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue;

import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

/**
 *
 * @author senho
 */
public class DirecaoAndar {
    Player player;
    int prevX;
    int prevY;
    GridPane mapGrid;
    
    public DirecaoAndar(Player player, int prevX, int prevY, GridPane mapGrid) {
    this.player = player;
    this.prevX = prevX;
    this.prevY = prevY;
    this.mapGrid = mapGrid;
}
    
    
    
   private Node getNode(GridPane gridPane, int col, int row) {
    for (Node node : gridPane.getChildren()) {
        if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
            return node;
        }
    }
    return null;
}

public void handle(KeyEvent event) {
    try {
        System.out.println("Player goes " + event.getCode());
        if (event.getCode() == KeyCode.DOWN) {
            System.out.println("Boas");
            this.player.setPosX(prevX);
            this.player.setPosY(prevY + 1);
            Node targetNode = getNode(mapGrid, prevX, prevY+1);
            System.out.println(targetNode.toString());
            System.out.println(this.player.getPosX() + " " + this.player.getPosY());
            mapGrid.add(this.player.playerLook(), player.getPosX(), player.getPosY()); }
    
    }catch(NullPointerException e){
        System.out.println("Não pode ir para essa casa");
    }
}
    
    
    
    
    
    
    
    
}
