package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class SearchWindow {

    private AnchorPane anchorPane;
    private TextField toSearch;

    public SearchWindow() {
        anchorPane =new AnchorPane();
        configureWin();
    }
    public AnchorPane getAnchorPane() { return anchorPane; }

    private void configureWin(){

        GridPane pane = new GridPane();

        Button searchByAuthor= new Button("search by author");
        Button searchByName = new Button("search by name");
        toSearch = new TextField();

        searchByAuthor.setPrefSize(140,48);
        searchByName.setPrefSize(140,48);

        pane.add(searchByAuthor,0,2);
        pane.add(searchByName,3,2);
        pane.add(toSearch,0,0,3,1);


        pane.setHgap(5);
        pane.setVgap(10);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }
}
