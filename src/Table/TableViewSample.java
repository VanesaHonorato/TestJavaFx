package Table;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TableViewSample extends Application {
//tableview de java fx por eso tableviewsample so lo pones table view solo pones tableviewsample

    
    private TableView table = new TableView();
    Scene scene = new Scene(new Group());// objeto anonimo 
    //LA VARIABLE ES REFERENCIA A GROUP ANONIMO CAPTURA Y USA

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception { //throw excepcion de java 
        Button button = new Button();
        button.setOnAction(e -> {
        });

        stage.show();
        stage.setWidth(300);
        stage.setHeight(500); //recise distribuye elementos 
        //        stage.setMaxHeight(500);
//        stage.setMaxWidth(300);
        final Label label = new Label("AdressBook");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        //encabezados de cada columna de la tabla
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        final VBox vbox = new VBox(); //tipo panel
        vbox.setSpacing(5); //vbox es espacio
        vbox.setPadding(new Insets(10, 0, 0, 10)); //pading otro tipo de espacio 
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }

}

