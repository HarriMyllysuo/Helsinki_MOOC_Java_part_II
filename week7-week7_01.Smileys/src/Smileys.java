
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("87.");
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {

        printRowOfSmileys(characterString);
        System.out.println("");

        if (characterString.length() % 2 == 1) {
            System.out.println(":) " + characterString + "  :)");
        } else {
            System.out.println(":) " + characterString + " :)");
        }

        printRowOfSmileys(characterString);
        System.out.println("");
    }

    private static void printRowOfSmileys(String characterString) {
        int i = 0;
        System.out.print(":):");
        if (characterString.length() % 2 == 1) {
            while (i < (characterString.length()/2) + 2) {
                System.out.print("):");
                i++;
            }
        } else {
            while (i < (characterString.length()/2) + 1) {
                System.out.print("):");
                i++;
            }
        }
        System.out.print(")");
    }

}
