package sdf;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Random;

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

    public void shuffle() {

        Random rand = new SecureRandom();

        for (int i = 0; i < Deck.size(); i++) {
            int randomNum = rand.nextInt(Deck.size());
            Card current = Deck.get(i);
            Card cardToBeSwapped = Deck.get(randomNum);
            Deck.set(i, cardToBeSwapped);
            Deck.set(randomNum,current);
        }
        
    }

    @Override
    public String toString() {
        return "Deck [Deck=" + Deck + "]";
    }

    
    
}
