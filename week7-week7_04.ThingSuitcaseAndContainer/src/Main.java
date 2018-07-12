
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {

        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("brick", i+1);
            Suitcase sc = new Suitcase(101);
            sc.addThing(brick);
            container.addSuitcase(sc);
        }
        
        /* Thing brick;
        Suitcase sc = new Suitcase(101);
        int i = 0;
        while (i < 100) {
            brick = new Thing("brick", (i + 1));
            sc.addThing(brick);
            if (sc.totalWeight() <= 100) {
                container.addSuitcase(sc);
            }
            i++;
        } */
    }
}
