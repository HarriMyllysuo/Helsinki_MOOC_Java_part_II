
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, sorter);
    }
    
    @Override
    public int compareTo(Hand hand) {
        int thisSum = 0;
        int handSum = 0;
        for (Card card : this.cards) {
            thisSum += card.getValue();
        }
        for (Card card : hand.cards) {
            handSum += card.getValue();
        }
        return thisSum - handSum;
    }
}
