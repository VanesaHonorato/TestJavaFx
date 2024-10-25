
package testjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author vanesahonorato
 */
public class TestJavaFX extends Application{
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage stage) throws Exception { //throw excepcion de java 
        Button button= new Button ("HELLO");
       button.setOnAction(e->{
           Alert alert = new Alert (AlertType.INFORMATION, "HELLO");
           alert.showAndWait();
       });
        StackPane root = new StackPane ();
        root.getChildren().add(button);
       Scene scene;
       scene = new Scene(root, 300, 300);
       stage.setScene(scene);
       
       stage.show();
       
        
    }
    
    
    
}
