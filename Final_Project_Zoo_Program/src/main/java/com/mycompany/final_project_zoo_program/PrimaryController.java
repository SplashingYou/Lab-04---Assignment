package com.mycompany.final_project_zoo_program;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PrimaryController extends Zoo {
    
    Zoo zoo = new Zoo("Virtual Zoo");
    
    @FXML
    Button selScreenbtn,exhibitScreenbtn,playAnimalBirdSoundbtn; 

    @FXML
    private void handleSelectScreenButton() throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
        Stage window = (Stage) selScreenbtn.getScene().getWindow();
        window.setScene(new Scene(root,640,480));
    }
    
    @FXML
     private void handlePlayAnimalButton() throws IOException{
         
     }
    
    @FXML
    private void handleExhibitScreenButton() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Exhibit Screen.fxml"));
        Stage window = (Stage) exhibitScreenbtn.getScene().getWindow();
        window.setScene(new Scene(root,640,480));
        
    
    
    }
}
