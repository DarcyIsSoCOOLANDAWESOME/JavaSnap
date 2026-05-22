package org.example;

import java.util.ArrayList;

public class CardGame {

    ArrayList<Card> deckOfCards = new ArrayList<Card>();

    public CardGame() {
        this.deckOfCards = getDeck();
    }

    ArrayList<Card> getDeck(){
        ArrayList<Card> newDeck = new ArrayList<>();
        for (Suit suit : Suit.values()){
            for (Symbol symbol : Symbol.values()){
                newDeck.add(new Card(suit, symbol));


            }
        }
        return newDeck;
    }
    private void makeDeck(){
        for (Suit suit : suit.values()){
            int value = 2;
            for(Symbol symbol : symbol.values()){
                deckOfCards.add(new Card(suit, symbol, value));
                value++;
            }
        }
    }
}

//Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards. This is created and populated when the game is constructed.
//Has a name which is also defined in the constructor.
//Has a getDeck method that lists out the cards in the deck.
//Card
//Has a String suit. Use the unicode characters of heart, club, diamond and spade.
//Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)
//Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14)
//Has a toString method that describes the class
