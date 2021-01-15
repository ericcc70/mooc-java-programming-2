package notifier;



import javafx.scene.control.TextField;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);

    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField topText = new TextField();
        Label bottomText = new Label();
        Button button = new Button("Update");

        button.setOnAction((event) -> {
            bottomText.setText(topText.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().add(topText);
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(bottomText);


        Scene scene = new Scene(componentGroup);

        stage.setScene(scene);
        stage.show();
    }

}
