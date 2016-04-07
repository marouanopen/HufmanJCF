/*  
 *  JCF opdracht 3
 */
package jcf.opdracht.pkg3;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    
}
