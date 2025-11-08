package Test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class demo16_3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle redLight = new Circle(20);
        redLight.setFill(Color.GRAY);
        redLight.setStroke(Color.BLACK);

        Circle yellowLight = new Circle(20);
        yellowLight.setFill(Color.GRAY);
        yellowLight.setStroke(Color.BLACK);

        Circle greenLight = new Circle(20);
        greenLight.setFill(Color.GRAY);
        greenLight.setStroke(Color.BLACK);

        VBox lights = new VBox(15);
        lights.setAlignment(Pos.CENTER);
        lights.setPadding(new Insets(20));
        lights.getChildren().addAll(redLight, yellowLight, greenLight);

        Rectangle frame = new Rectangle(80, 220);
        frame.setFill(Color.TRANSPARENT);
        frame.setStroke(Color.BLACK);
        frame.setStrokeWidth(2);

        StackPane lightContainer = new StackPane();
        lightContainer.getChildren().addAll(frame, lights);

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbGreen = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        HBox buttons = new HBox(10);
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(10));
        buttons.getChildren().addAll(rbRed, rbYellow, rbGreen);

        rbRed.setOnAction(e -> {
            redLight.setFill(Color.RED);
            yellowLight.setFill(Color.GRAY);
            greenLight.setFill(Color.GRAY);
        });

        rbYellow.setOnAction(e -> {
            redLight.setFill(Color.GRAY);
            yellowLight.setFill(Color.YELLOW);
            greenLight.setFill(Color.GRAY);
        });

        rbGreen.setOnAction(e -> {
            redLight.setFill(Color.GRAY);
            yellowLight.setFill(Color.GRAY);
            greenLight.setFill(Color.GREEN);
        });

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(lightContainer, buttons);

        Scene scene = new Scene(root, 250, 400);
        primaryStage.setTitle("Exercise16_3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
