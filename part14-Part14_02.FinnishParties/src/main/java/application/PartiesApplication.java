package application;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        //parse through file
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        File myObj = new File("partiesdata.tsv");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] pieces = data.split("\t");
            if (!pieces[0].equals("Party")) {
                Map<Integer, Double> one = new HashMap<>();
                if (!pieces[1].equals("-")) {
                    one.put(1968, Double.valueOf(pieces[1]));

                }
                if (!pieces[2].equals("-")) {
                    one.put(1972, Double.valueOf(pieces[2]));
                }
                if (!pieces[3].equals("-")) {
                    one.put(1976, Double.valueOf(pieces[3]));

                }
                if (!pieces[4].equals("-")) {
                    one.put(1980, Double.valueOf(pieces[4]));

                }
                if (!pieces[5].equals("-")) {
                    one.put(1984, Double.valueOf(pieces[5]));

                }
                if (!pieces[6].equals("-")) {
                    one.put(1988, Double.valueOf(pieces[6]));

                }
                if (!pieces[7].equals("-")) {
                    one.put(1992, Double.valueOf(pieces[7]));

                }
                if (!pieces[8].equals("-")) {
                    one.put(1996, Double.valueOf(pieces[8]));

                }
                if (!pieces[9].equals("-")) {
                    one.put(2000, Double.valueOf(pieces[9]));

                }
                if (!pieces[10].equals("-")) {
                    one.put(2004, Double.valueOf(pieces[10]));

                }
                if (!pieces[11].equals("-")) {
                    one.put(2008, Double.valueOf(pieces[11]));

                }
  
                values.put(pieces[0], one);
            }

        }
        // go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}
