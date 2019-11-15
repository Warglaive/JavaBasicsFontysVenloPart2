
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card card : this.hand) {
            System.out.println(card.toString());
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand o) {
        int firstHandSum = 0;
        for (Card card : this.hand) {
            firstHandSum += card.getValue();
        }
        int secondHandSum = 0;
        for (Card card : o.hand) {
            secondHandSum += card.getValue();
        }
        if (firstHandSum > secondHandSum) {
            return 1;
        } else if (firstHandSum < secondHandSum) {
            return -1;
        } else {
            return 0;
        }
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue comparator = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}
