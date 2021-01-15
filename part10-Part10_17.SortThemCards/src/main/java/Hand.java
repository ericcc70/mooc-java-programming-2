
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericjiang
 */
public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card kortti) {
        cards.add(kortti);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    public void sort() {
        Collections.sort(cards);
    }
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand o) {
        return this.sumOfValues() - o.sumOfValues();
    }
    private int sumOfValues() {
        int sum = 0;
 
        for (Card card : cards) {
            sum += card.getValue();
        }
 
        return sum;
    }
}
