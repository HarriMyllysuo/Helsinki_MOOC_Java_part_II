
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        // Airplane airplane = new Airplane("HA-LOL", 200);
        // System.out.println(airplane);
        // Flight flight = new Flight(airplane, "HEL", "TOK");
        // System.out.println(flight);
        UserInterface ui = new UserInterface(reader);
        ui.start();
    }
}
