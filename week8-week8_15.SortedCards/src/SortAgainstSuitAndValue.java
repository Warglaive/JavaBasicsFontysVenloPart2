
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card cardOne, Card cardTwo) {
        if (cardOne.getSuit() == cardTwo.getSuit()) {
            return cardOne.getValue() - cardTwo.getValue();
        }
        return cardOne.getSuit() - cardTwo.getSuit();
    }
}
