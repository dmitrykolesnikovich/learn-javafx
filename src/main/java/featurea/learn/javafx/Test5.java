package featurea.learn.javafx;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

// DrawingText
public class Test5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Chapter 2 Drawing Text");
        Group rootGroup = new Group();
        Scene scene = new Scene(rootGroup, 300, 250, Color.WHITE);
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt((int) scene.getWidth());
            int y = random.nextInt((int) scene.getHeight());
            int red = random.nextInt(255);
            int green = random.nextInt(255);
            int blue = random.nextInt(255);
            Text text = new Text(x, y, "JavaFX 8");
            int rot = random.nextInt(360);
            text.setFill(Color.rgb(red, green, blue, .99));
            text.setRotate(rot);
            rootGroup.getChildren().add(text);
        }
        stage.setScene(scene);
        stage.show();
    }

}
