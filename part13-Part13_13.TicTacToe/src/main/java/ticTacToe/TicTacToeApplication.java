package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        Label title = new Label("Turn: X");
        layout.setTop(title);
        Button one = createButton();
        Button two = createButton();
        Button three = createButton();
        Button four = createButton();
        Button five = createButton();
        Button six = createButton();
        Button seven = createButton();
        Button eight = createButton();
        Button nine = createButton();
        one.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (one.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    one.setText("X");
                    if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")||one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")|| one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    one.setText("O");
                    if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")||one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")|| one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        two.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (two.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    two.setText("X");
                    if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")||two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    two.setText("O");
                    if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")||two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        three.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (three.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    three.setText("X");
                    if(one.getText().equals("X")&&two.getText().equals("X")&&three.getText().equals("X")||three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")|| three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    three.setText("O");
                    if(one.getText().equals("O")&&two.getText().equals("O")&&three.getText().equals("O")||three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")|| three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        four.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (four.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    four.setText("X");
                    if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")||four.getText().equals("X")&&one.getText().equals("X")&&seven.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    four.setText("O");
                    if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")||four.getText().equals("O")&&one.getText().equals("O")&&seven.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        five.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (five.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    five.setText("X");
                    if(one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")||two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")|| three.getText().equals("X")&&five.getText().equals("X")&&seven.getText().equals("X")|| four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    five.setText("O");
                    if(one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")||two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")|| three.getText().equals("O")&&five.getText().equals("O")&&seven.getText().equals("O")|| four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        six.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (six.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    six.setText("X");
                    if(four.getText().equals("X")&&five.getText().equals("X")&&six.getText().equals("X")||six.getText().equals("X")&&three.getText().equals("X")&&nine.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    six.setText("O");
                    if(four.getText().equals("O")&&five.getText().equals("O")&&six.getText().equals("O")||six.getText().equals("O")&&three.getText().equals("O")&&nine.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        seven.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (seven.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    seven.setText("X");
                    if(one.getText().equals("X")&&four.getText().equals("X")&&seven.getText().equals("X")||seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")|| seven.getText().equals("X")&&three.getText().equals("X")&&five.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    seven.setText("O");
                    if(one.getText().equals("O")&&four.getText().equals("O")&&seven.getText().equals("O")||seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")|| seven.getText().equals("O")&&three.getText().equals("O")&&five.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        eight.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (eight.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    eight.setText("X");
                    if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")||two.getText().equals("X")&&five.getText().equals("X")&&eight.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    eight.setText("O");
                    if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")||two.getText().equals("O")&&five.getText().equals("O")&&eight.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        nine.setOnAction((event) -> {
            String frank = title.getText();
            String[] parts = frank.split(" ");
            String turn = parts[1];
            if (nine.getText().equals(" ")) {
                if (turn.equals("X")) {
                    
                    nine.setText("X");
                    if(seven.getText().equals("X")&&eight.getText().equals("X")&&nine.getText().equals("X")||three.getText().equals("X")&&six.getText().equals("X")&&nine.getText().equals("X")|| one.getText().equals("X")&&five.getText().equals("X")&&nine.getText().equals("X")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: O");
                    }
                } else if (turn.equals("O")) {
                    
                    nine.setText("O");
                    if(seven.getText().equals("O")&&eight.getText().equals("O")&&nine.getText().equals("O")||three.getText().equals("O")&&six.getText().equals("O")&&nine.getText().equals("O")|| one.getText().equals("O")&&five.getText().equals("O")&&nine.getText().equals("O")){
                        title.setText("The end!");
                    } else{
                        title.setText("Turn: X");
                    }
                }
            }
        });
        
        
        
        

        GridPane grid = new GridPane();
        grid.add(one, 0, 0);
        grid.add(two, 0, 1);
        grid.add(three, 0, 2);
        grid.add(four, 1, 0);
        grid.add(five, 1, 1);
        grid.add(six, 1, 2);
        grid.add(seven, 2, 0);
        grid.add(eight, 2, 1);
        grid.add(nine, 2, 2);
        layout.setCenter(grid);
        // 6. Create the main view and add the high level layout
        Scene view = new Scene(layout, 400, 300);

        // 7. Show the application
        stage.setScene(view);
        stage.show();

    }

    public Button createButton() {
        Button btn = new Button(" ");
        btn.setFont(Font.font("Monospaced", 40));
        return btn;
    }

}
