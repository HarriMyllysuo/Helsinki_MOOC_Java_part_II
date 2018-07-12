
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write some test code here

        // ---- Exercise 15.3: Sorting the Hand ----
        /* Hand hand = new Hand();
        
        hand.add(new Card(2, Card.SPADES));
        hand.add(new Card(14, Card.CLUBS));
        hand.add(new Card(12, Card.HEARTS));
        hand.add(new Card(2, Card.CLUBS));
        
        hand.print();
        hand.sort();
        System.out.println("");
        hand.print(); */
        
        
        // ---- Exercise 15.4: Comparing Hands ----
        /* Hand hand1 = new Hand();

        hand1.add(new Card(2, Card.SPADES));
        hand1.add(new Card(14, Card.CLUBS));
        hand1.add(new Card(12, Card.HEARTS));
        hand1.add(new Card(2, Card.CLUBS));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Card.DIAMONDS));
        hand2.add(new Card(11, Card.CLUBS));
        hand2.add(new Card(11, Card.HEARTS));

        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("the most valuable hand contains the cards");
            hand2.print();
        } else if (comparison > 0) {
            System.out.println("the most valuable hand contains the cards");
            hand1.print();
        } else {
            System.out.println("the hands are equally valuable");
        } */
        
        
        // ---- Exercise 15.5: Sorting the Cards against Different Criteria ----
        /* ArrayList<Card> cards = new ArrayList<Card>();
        
        cards.add( new Card(3, Card.CLUBS) );
        cards.add( new Card(2, Card.DIAMONDS) );
        cards.add( new Card(14, Card.CLUBS) );
        cards.add( new Card(12, Card.HEARTS) );
        cards.add( new Card(2, Card.CLUBS) );
        
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, sorter);
        
        for (Card c : cards) {
            System.out.println(c);
        } */
        
        
        // Exercise 15.6: Sort Against Suit
        Hand hand = new Hand();

        hand.add(new Card(12, Card.HEARTS));
        hand.add(new Card(4, Card.CLUBS));
        hand.add(new Card(2, Card.DIAMONDS));
        hand.add(new Card(14, Card.CLUBS));
        hand.add(new Card(7, Card.HEARTS));
        hand.add(new Card(2, Card.CLUBS));
        
        hand.sortAgainstSuit();
        
        hand.print();
    }
}
