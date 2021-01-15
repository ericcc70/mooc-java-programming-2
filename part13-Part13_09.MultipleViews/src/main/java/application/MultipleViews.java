package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane componentGroup = new BorderPane();
        componentGroup.setTop(new Label("First view!"));
        Button back = new Button("To the second view!");
        componentGroup.setCenter(back);
        VBox componenentGroup2 = new VBox();
        Button second1 = new Button("To the third view!");
        Label second2 = new Label("To the third view!");
        componenentGroup2.getChildren().addAll(second1, second2);
        GridPane componentGroup3 = new GridPane();
        Button third1 = new Button("To the first view!");
        componentGroup3.add(new Label("Third view!"), 0, 0);
        componentGroup3.add(third1, 1, 1);

        Scene first = new Scene(componentGroup);
        Scene second = new Scene(componenentGroup2);
        Scene third = new Scene(componentGroup3);
        back.setOnAction((event) -> {
            stage.setScene(second);
        });
        second1.setOnAction((event) -> {
            stage.setScene(third);
        });
        third1.setOnAction((event) -> {
            stage.setScene(first);
        });
        stage.setScene(first);
        stage.show();

    }

}
