package view;
import Entity.File;
import Entity.FileCollection;
import Service.FileCollectionService;
import Service.FileService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import view.SearchWindow;
import view.UploadWindow;


public class MainWindow {

    private Label collectionAuthor;
    private Label collectionName;
    private ListView<FileCollection> collectionListView;
    private ListView<File> contentOfCollection;
    private FileService fileService;
    private FileCollectionService fileCollectionService;

   private AnchorPane anchorPane;


    public MainWindow(FileCollectionService fileCollectionService,FileService fileService) {
        this.fileCollectionService = fileCollectionService;
        this.fileService=fileService;
        anchorPane =new AnchorPane();
        configureWin();
    }

    public AnchorPane getAnchorPane() { return anchorPane; }

    private void configureWin(){

        GridPane pane = new GridPane();
        collectionListView =new ListView<>();
        contentOfCollection = new ListView<>();
        Button open= new Button("Open");
        Button create = new Button("Create");
        Button search = new Button("Search");

        open.setPrefSize(140,48);
        create.setPrefSize(140,48);
        search.setPrefSize(140,48);

        Label collectionAuthor = new Label("author");
        Label collectionName = new Label("collec Name");

        open.setOnAction(openEq);
        create.setOnAction(uploadEq);
        search.setOnAction(tableEq);

        GridPane gridIn = new GridPane();


        gridIn.add(open,0,0);
        gridIn.add(create,0,1);
        gridIn.add(search,0,2);
        pane.add(gridIn,0,0);
        pane.add(collectionListView,1,0);
        pane.add(collectionAuthor,0,5);
        pane.add(collectionName,0,6);
        pane.add(contentOfCollection,0,7);
        pane.setHgap(5);
        pane.setVgap(10);

        AnchorPane.setLeftAnchor(pane,50.0);
        AnchorPane.setTopAnchor(pane,50.0);
        anchorPane.getChildren().addAll(pane);
    }

    private EventHandler<ActionEvent> tableEq = e -> {

            SearchWindow equipmentWindow =new SearchWindow();
            Scene scene =new Scene(equipmentWindow.getAnchorPane(),500,300);
            Stage newWindow = new Stage();
            newWindow.setScene(scene);
            newWindow.show();

    };
    private EventHandler<ActionEvent> uploadEq = e -> {

        UploadWindow equipmentWindow =new UploadWindow();
        Scene scene =new Scene(equipmentWindow.getAnchorPane(),500,300);
        Stage newWindow = new Stage();
        newWindow.setScene(scene);
        newWindow.show();

    };

    private EventHandler<ActionEvent> openEq = e -> {

        CollectionWindow equipmentWindow =new CollectionWindow();
        Scene scene =new Scene(equipmentWindow.getAnchorPane(),500,600);
        Stage newWindow = new Stage();
        newWindow.setScene(scene);
        newWindow.show();

    };
}
