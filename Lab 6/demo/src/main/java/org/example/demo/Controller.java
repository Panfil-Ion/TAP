package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class Controller {
    @FXML
    private Circle circle;
    @FXML
    private Line line;
    @FXML
    private Rectangle rectangle;

    @FXML
    public void startAnimation() {
        animate(circle, -400, -285);
        animate(line, 440, 90);
        animate(rectangle, -600, -305);
    }

    @FXML
    public void resetAnimation() {
        animate(circle, 0, 0);
        animate(line, 0, 0);
        animate(rectangle, 0, 0);
    }

    private void animate(javafx.scene.Node node, double x, double y) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(2000), node);
        tt.setToX(x);
        tt.setToY(y);
        tt.play();
    }
}
