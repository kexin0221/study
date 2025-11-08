package Test;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class demo15_28 extends Application {

    private RotateTransition rotateTransition;
    private boolean isReversed = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane = new BorderPane();

        Pane fanPane = new Pane();
        fanPane.setPrefSize(200, 200);

        double centerX = 100;
        double centerY = 100;

        Circle circle = new Circle(centerX, centerY, 90);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        fanPane.getChildren().add(circle);

        Pane bladesPane = new Pane();
        for(int i = 0; i < 4; i++) {
            Arc arc = new Arc(centerX, centerY, 80, 80, 30 + i * 90, 30);
            arc.setFill(Color.RED);
            arc.setType(ArcType.ROUND);
            bladesPane.getChildren().add(arc);
        }
        fanPane.getChildren().add(bladesPane);

        borderPane.setCenter(fanPane);

        rotateTransition = new RotateTransition(Duration.millis(2000), bladesPane);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(false);
        rotateTransition.setInterpolator(javafx.animation.Interpolator.LINEAR);

        bladesPane.setRotate(0);
        bladesPane.setRotationAxis(javafx.scene.transform.Rotate.Z_AXIS);
        rotateTransition.setNode(bladesPane);
        rotateTransition.play();

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(10));

        Button btnPause = new Button("Pause");
        Button btnResume = new Button("Resume");
        Button btnReverse = new Button("Reverse");

        buttonBox.getChildren().addAll(btnPause, btnResume, btnReverse);
        borderPane.setBottom(buttonBox);

        btnPause.setOnAction(e -> rotateTransition.pause());

        btnResume.setOnAction(e -> rotateTransition.play());

        btnReverse.setOnAction(e -> {
            if (isReversed) {
                rotateTransition.setRate(1);
            } else {
                rotateTransition.setRate(-1);
            }
            isReversed = !isReversed;
        });

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle("Exercise15_28");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}