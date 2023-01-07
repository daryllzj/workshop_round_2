package sdf;

public class Card {

    private String suit;
    private String name;
    private int value;


    public Card(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }


    public String getSuit() {
        return suit;
    }


    public String getName() {
        return name;
    }


    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "\nCard [suit=" + suit + ", name=" + name + ", value=" + value + "]";
    }

    
    
}
