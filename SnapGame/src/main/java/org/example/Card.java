package org.example;

public class Card {

 private Suit suit;
 private Symbol symbol;

    public Card(Suit suit, Symbol symbol) {
        this.suit = suit;
        this.symbol = symbol;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public int getNumValue(){return symbol.numValue();}

    @Override
    public String toString() {return symbol.numValue() + symbol.letterValue();}

}
