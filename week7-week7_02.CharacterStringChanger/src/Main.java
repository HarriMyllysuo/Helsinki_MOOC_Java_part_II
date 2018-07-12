public class Main {
    public static void main(String[] args) {
        // Test your program here
        //String word = "carrot";
        //Change change1 = new Change('a', 'b');
        //word = change1.change(word);
        
        //System.out.println(word);
        
        //Change change2 = new Change('r', 'x');
        //word = change2.change(word);
        
        //System.out.println(word);
        
        Changer testingChanger = new Changer();
        testingChanger.addChange(new Change('a', 'ä'));
        testingChanger.addChange(new Change('v', 'p'));
        testingChanger.addChange(new Change('t', 'l'));
        
        System.out.println(testingChanger.change("voita voita"));
        //System.out.println(word);
    }
}
