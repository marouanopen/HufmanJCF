/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcf.opdracht.pkg3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author marouano
 */
public class JCFGUIController implements Initializable {

    @FXML
    private AnchorPane AnkerLinks;
    @FXML
    private TreeView<?> BoomZicht;
    @FXML
    private AnchorPane AnkerRechts;
    @FXML
    private TableView<?> TafelZicht;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
