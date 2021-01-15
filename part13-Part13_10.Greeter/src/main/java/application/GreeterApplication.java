package application;

import java.util.Arrays;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 1. Creating the view for asking a password

        // 1.1 Creating components to be used
        Label instructionText = new Label("Enter your name and start");
        TextField name = new TextField();
        Button startButton = new Button("Start");

        // 1.2 creating layout and adding components to it
        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(name, 0, 1);
        layout.add(startButton, 0, 2);

        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // 1.4 creating the view itself and setting it to use the layout
        Scene passwordView = new Scene(layout);

        // 2. Creating a view for showing the welcome message
        Label welcomeText = new Label();

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        name.textProperty().addListener((change, oldValue, newValue) -> {
            welcomeText.setText("Welcome " + newValue+"!");

        });
        
        // 3. Adding an event handler to the login button.
        // The view is changed if the password is right.
        startButton.setOnAction((event) -> {
            

            stage.setScene(welcomeView);
        });

        stage.setScene(passwordView);
        stage.show();
    }
}
