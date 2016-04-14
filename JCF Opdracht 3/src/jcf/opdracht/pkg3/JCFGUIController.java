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
        TreeItem<String> rootNode = new TreeItem<>("eSport Games");
        rootNode.setExpanded(true);
        List<Speler> spelerList = createData();
        for(Speler speler : spelerList)          
        {
            TreeItem<String> eGame = new TreeItem<>(speler.gameName);
            boolean gevonden = false;
            for(TreeItem<String> gameNode : rootNode.getChildren())
            {
                if(gameNode.getValue().contentEquals(speler.gameName))
                {
                    gameNode.getChildren().add(new TreeItem<>(speler.teamName));
                    gevonden = true;
                    break;
                }
            }
            if(!gevonden)
            {                
                rootNode.getChildren().add(eGame);
                eGame.getChildren().add(new TreeItem<>(speler.teamName));                
            }
            
        }
        BoomZicht.setRoot(rootNode);        
    }
    /**
     * Maakt en returnt een lijst met speler data om in de treeview te platsen
     * @return 
     */
 public List<Speler> createData() {
        List<Speler> spelers = Arrays.<Speler>asList (
            new Speler("Smite", "Cloud9", "BaRRaCCuDDa", 10, 0, 12),
            new Speler("Smite", "Cloud9", "Andinster", 7, 3, 6),
            new Speler("Smite", "Cloud9", "TheBoosh", 5, 1, 3),
            new Speler("Smite", "Panthera", "Incon", 8, 2, 7),
            new Speler("Smite", "Panthera", "SycloneSpin", 25, 0, 3),
            new Speler("Smite", "Panthera", "Jeff 'The Sex' Hindla", 8, 2, 7),
            new Speler("CS:GO","FNATIC","OlofMeister", 3, 5, 4),
            new Speler("CS:GO","TeamEnvious","Happy", 12, 70, 1));
        return spelers;
    }    
    
}
