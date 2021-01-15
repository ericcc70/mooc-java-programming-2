package FlightControl;

import FlightControl.logic.FlightControl;
import FlightControl.ui.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner reader = new Scanner(System.in);
        FlightControl fc = new FlightControl();

        TextUI ui = new TextUI(fc, reader);
        ui.start();
    }
}
