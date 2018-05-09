package featurea.learn.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

// ChangingTextFonts
public class Test2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Chapter 2 Changing Text Fonts");
        System.out.println("Font families: ");
        Font.getFamilies().stream().forEach(font -> {
            System.out.println(font);
        });
        System.out.println("Font names: ");
        Font.getFontNames().stream().forEach(font -> {
            System.out.println(font);
        });
        Group rootGroup = new Group();
        Scene scene = new Scene(rootGroup, 580, 250, Color.WHITE);
        // Serif font
        Text text2 = new Text(50, 50, "JavaFX 8: Intro. by Example");
        Font fontSerif = Font.font("Serif", 30);
        text2.setFont(fontSerif);
        text2.setFill(Color.RED);
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(2.0f);
        dropShadow.setOffsetY(2.0f);
        dropShadow.setColor(Color.rgb(50, 50, 50, .588));
        text2.setEffect(dropShadow);
        rootGroup.getChildren().add(text2);
        // SanSerif font
        Text text3 = new Text(50, 100, "JavaFX 8: Intro. by Example");
        Font fontSanSerif = Font.font("SanSerif", 30);
        text3.setFont(fontSanSerif);
        text3.setFill(Color.BLUE);
        rootGroup.getChildren().add(text3);
        // Dialog font
        Text text4 = new Text(50, 150, "JavaFX 8: Intro. by Example");
        Font fontDialog = Font.font("Dialog", 30);
        text4.setFont(fontDialog);
        text4.setFill(Color.rgb(0, 255, 0));
        rootGroup.getChildren().add(text4);
        // Monospaced font
        Text text5 = new Text(50, 200, "JavaFX 8: Intro. by Example");
        Font fontMonospaced = Font.font("Monospaced", 30);
        text5.setFont(fontMonospaced);
        text5.setFill(Color.BLACK);
        rootGroup.getChildren().add(text5);
        // Reflection effect
        Reflection reflection = new Reflection();
        reflection.setFraction(0.8f);
        reflection.setTopOffset(5);
        text5.setEffect(reflection);
        stage.setScene(scene);
        stage.show();
    }

}
