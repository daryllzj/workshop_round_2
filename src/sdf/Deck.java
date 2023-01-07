package sdf;

import java.util.LinkedList;

public class Deck {

    LinkedList<Card> Deck =new LinkedList<>();

    public void createDeck() {

        for (int i = 0; i < CardConstants.SUITS.length; i++) {
            String suit = CardConstants.SUITS[i];
            for (int j = 0; j < CardConstants.NAME.length; j++) {
                String name = CardConstants.NAME[j];
                int value = CardConstants.VALUES[j];
                Card card = new Card(suit, name, value);
                Deck.add(card);
            }
        }
    }

    @Override
    public String toString() {
        return "Deck [Deck=" + Deck + "]";
    }

    
    
}
