package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class UploadWindow {

    private AnchorPane anchorPane;
    private TextField toSearch;

    public UploadWindow() {
        anchorPane =new AnchorPane();
        configureWin();
    }
    public AnchorPane getAnchorPane() { return anchorPane; }

    private void configureWin(){

        GridPane pane = new GridPane();

        Button upload= new Button("upload");
        toSearch = new TextField();

        upload.setPrefSize(140,48);

        pane.add(upload,0,2);
        pane.add(toSearch,0,0,3,1);


        pane.setHgap(5);
        pane.setVgap(10);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }
}
