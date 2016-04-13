/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcf.opdracht.pkg3;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
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
    private TreeView<String> BoomZicht;
    @FXML
    private AnchorPane AnkerRechts;
    @FXML
    private TableView<?> TafelZicht;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TreeItem<String> rootNode = new TreeItem<String>("eSport games");
        rootNode.setExpanded(true);
        for(Speler i : createData()){
            TreeItem<String> item = new TreeItem<String>(i.teamName);
            boolean gevonden = false;
            for(TreeItem<String> gameNode : rootNode.getChildren())
            {
                if(gameNode.getValue().contentEquals(i.gameName))
                {
                    gameNode.getChildren().add(item);
                    gevonden = true;
                    break;
                }
            }
            if(!lgevonden){
                TreeItem<String> gameNode = new TreeItem<String>(
                i.gameName);
                rootNode.getChildren().add(item);
            }
            
        }
        BoomZicht.setRoot(rootNode);
        // TODO
    }
 public List<Speler> createData() {
        List<Speler> spelers = Arrays.<Speler>asList (
            new Speler("Smite", "Cloud9", "Baracuda", 10, 0, 12),
            new Speler("Smite", "Panthera", "incon", 8, 2, 7),
            new Speler("CS:GO","FNATIC","OlofMeister", 3, 5, 4),
            new Speler("CS:GO","TeamEnvious","Happy", 12, 70, 1));
        return spelers;
    }    
    
}
