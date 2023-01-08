package sdf;

public class DeckMain {

    public static void main(String[] args) {
        
        Deck deck = new Deck();
        deck.createDeck();
        System.out.println(deck.toString());

        System.out.println(">>>> After Shuffle");

        deck.shuffle();
        System.out.println(deck.toString());

    }
    
}
