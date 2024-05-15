package org.example.demo;

import javafx.animation.AnimationTimer;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.util.Random;

public class Controller {

    @FXML
    private Circle circle;
    @FXML
    private Button startButton;
    @FXML
    private Button stopButton;
    @FXML
    private Label label;

    private Random random = new Random();
    private double speed = 3.0;
    private double angle = random.nextDouble() * 2 * Math.PI;
    private double dx = speed * Math.cos(angle);
    private double dy = speed * Math.sin(angle);
    private boolean isRunning = false;
    private AnimationTimer timer;

    public void initialize() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (circle.getLayoutX() < 0 || circle.getLayoutX() > 800) {
                    dx *= -1;
                    bounce();
                }
                if (circle.getLayoutY() < 0 || circle.getLayoutY() > 600) {
                    dy *= -1;
                    bounce();
                }
                circle.setLayoutX(circle.getLayoutX() + dx);
                circle.setLayoutY(circle.getLayoutY() + dy);
            }
        };

        startButton.setOnAction(event -> startAnimation());
        stopButton.setOnAction(event -> stopAnimation());
    }

    private void startAnimation() {
        if (!isRunning) {
            timer.start();
            startButton.setText("Start");
            label.setText("Status: Running");
            isRunning = true;
        }
    }

    private void stopAnimation() {
        if (isRunning) {
            timer.stop();
            stopButton.setText("Stop");
            label.setText("Status: Stopped");
            isRunning = false;
        }
    }

    private void bounce() {
        ScaleTransition st = new ScaleTransition(Duration.millis(100), circle);
        st.setFromX(1.0);
        st.setFromY(1.0);
        st.setToX(0.8); // Compress to 80% of the original size
        st.setToY(0.8); // Compress to 80% of the original size
        st.setAutoReverse(true);
        st.setCycleCount(2); // One cycle for compression and one for expansion
        st.play();
    }
}
