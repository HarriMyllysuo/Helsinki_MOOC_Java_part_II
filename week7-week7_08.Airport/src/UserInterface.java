
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;
    private Scanner reader;
    
    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void start() {
        
        airportPanel();
        flightService();
    }
    
    private void airportPanel() {
        System.out.println("Airport panel\n--------------------");
        
        while (true) {
            System.out.print("\nChoose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n> ");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            }
            else if (command.equals("1")) {
                addAirplane();
            }
            else if (command.equals("2")) {
                addFlight();
            }
        }
    }
    
    private void flightService() {
        System.out.println("\nFlight service\n------------");
        
        while (true) {
            System.out.print("\nChoose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n> ");
            String command = reader.nextLine();
            if (command.equals("x")) {
                break;
            }
            else if (command.equals("1")) {
                for (Airplane plane : airplanes) {
                    System.out.println(plane);
                }
            }
            else if (command.equals("2")) {
                for (Flight flight : flights) {
                    System.out.println(flight);
                }
            }
            else if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                for (Airplane plane : airplanes) {
                    if (plane.getName().equals(id)) {
                        System.out.println(plane);
                    }
                }
            }
        }
    }
    
    /**
     * The helping methods starts from here
     */
    
    private void addAirplane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        airplanes.add(new Airplane(id, capacity));
    }
    
    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        
        System.out.print("Give departure airport code: ");
        String depCode = reader.nextLine();
        
        System.out.print("Give destination airport code: ");
        String destCode = reader.nextLine();
        
        Airplane airplane = checkAirplane(id);
        
        Flight flight = new Flight(airplane, depCode, destCode);
        this.flights.add(flight);
    }
    
    private Airplane checkAirplane(String id) {
        for (Airplane plane : airplanes) {
            if (plane.getName().equals(id)) {
                return plane;
            }
        }
        return null;
    }
}
