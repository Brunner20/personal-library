package view;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class CollectionWindow {

    private AnchorPane anchorPane;
    private TextField toSearch;

    public CollectionWindow() {
        anchorPane =new AnchorPane();
        configureWin();
    }
    public AnchorPane getAnchorPane() { return anchorPane; }

    private void configureWin(){

        GridPane pane = new GridPane();

        Button download= new Button("download");
        Button open = new Button("open");
        Button add = new Button("add");
        Button remove = new Button("remove");

        ListView<String> tracks = new ListView<>();


        pane.add(download,0,3);
        pane.add(open,1,3);
        pane.add(add,0,4);
        pane.add(remove,1,4);

        pane.add(tracks,0,0,2,1);


        pane.setHgap(5);
        pane.setVgap(10);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }
}
