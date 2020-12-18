package sample;

import Service.FileCollectionService;
import Service.FileService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainWindow;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FileCollectionService collectionService = new FileCollectionService();
        FileService fileService = new FileService();
        MainWindow window = new MainWindow(collectionService,fileService);
        Scene scene =new Scene(window.getAnchorPane(),950,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
