package org.example;

public enum Suit {
    SPADES("♠"), HEARTS("♥"), DIAMONDS("♦"), CLUBS("♣");

    final String suitSymbol;

    public String getSuitSymbol() {
        return suitSymbol;
    }

    Suit(String suitSymbol) {

        this.suitSymbol = suitSymbol;

    }


}
