package org.example;

public enum Suit {
    SPADES("♠"), HEARTS("♥"), DIAMONDS("♦"), CLUBS("♣");

    final String suitSymbol;

    Suit(String suitSymbol1) {

        this.suitSymbol = suitSymbol1;
    }

}
