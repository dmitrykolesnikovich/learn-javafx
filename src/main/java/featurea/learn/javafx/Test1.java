package featurea.learn.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Test1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello World");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        Button button = new Button();
        button.setLayoutX(100);
        button.setLayoutY(80);
        button.setText("Hello World");
        button.setOnAction(event -> System.out.println("Hello World"));
        root.getChildren().add(button);
        stage.setScene(scene);
        stage.show();
    }

}
