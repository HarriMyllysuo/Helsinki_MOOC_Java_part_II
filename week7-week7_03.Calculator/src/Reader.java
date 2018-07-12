
import java.util.Scanner;

public class Reader {
    
    private Scanner scanner = new Scanner(System.in);
    
    public String readString() {
        String reader = scanner.nextLine();
        return reader;
    }
    
    public int readInteger() {
        int reader = Integer.parseInt(scanner.nextLine());
        return reader;
    }
}
