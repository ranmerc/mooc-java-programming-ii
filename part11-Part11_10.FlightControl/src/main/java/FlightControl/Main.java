package FlightControl;

import FlightControl.ui.TextUI;

import java.util.Scanner;

import FlightControl.logic.FlightControl;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl flightControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);

        TextUI textUI = new TextUI(flightControl, scanner);
        textUI.start();
    }
}
