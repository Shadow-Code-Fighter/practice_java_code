import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

import java.util.Timer;
import java.util.TimerTask;

public class WaterReminderApp extends Application {
    private Timer timer;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Water Reminder App");

        // Create UI components (labels, buttons, etc.) and set up event handling here.

        // Create a reminder notification
        Button reminderButton = new Button("Remind Me");
        reminderButton.setOnAction(e -> showReminder());

        // Add components to the layout
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(reminderButton);

        // Create the scene and set it as the primary stage's scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();

        // Start the timer to show reminders every hour
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                showReminder();
            }
        }, 0, 1000 * 60 * 60); // 1000 milliseconds * 60 seconds * 60 minutes = 1 hour
    }

    private void showReminder() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Drink Water Reminder");
        alert.setHeaderText(null);
        alert.setContentText("It's time to drink water!");

        alert.showAndWait();
    }

    @Override
    public void stop() {
        // Stop the timer when the application is closed
        timer.cancel();
    }
}
