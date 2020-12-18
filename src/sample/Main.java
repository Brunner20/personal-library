package sample;

import Entity.File;
import Entity.FileCollection;
import Service.FileCollectionService;
import Service.FileService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainWindow;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        List<FileCollection> collections = new ArrayList<>();
        FileCollectionService collectionService = new FileCollectionService(collections);

        List<File> files =new ArrayList<>();
        FileService fileService = new FileService(files);
        MainWindow window = new MainWindow(collectionService,fileService);
        Scene scene =new Scene(window.getAnchorPane(),950,1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
