/*  
 *  JCF opdracht 3
 */
package jcf.opdracht.pkg3;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Marouan Bakour
 * @author Sibe
 */
public class JCFOpdracht3 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        // maak data aan om in de views toe te voegen
        createData();
        //load the FXML document into a container (Parent is a generic container)
        Parent root = FXMLLoader.load(getClass().getResource("JCFGUI.fxml"));
        //create the scene
        Scene scene = new Scene(root);
        //put the scene on the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("JCF Opdracht 3");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public List<Speler> createData() {
        List<Speler> spelers = Arrays.<Speler>asList (
            new Speler("Smite", "Cloud9", "Baracuda", 10, 0, 12),
            new Speler("Smite", "Panthera", "incon", 8, 2, 7),
            new Speler("CSGO","FNATIC","OlofMeister", 3, 5, 4),
            new Speler("CSGO","TeamEnvious","Happy", 12, 70, 1));
        return spelers;
    }
    
    public void bouwBoom(List<Speler> deList)
    {
        TreeItem<String> rootNode = new TreeItem<String>("eSport games");
    }
    
}
