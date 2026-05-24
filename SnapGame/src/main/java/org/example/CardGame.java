package org.example;

import java.util.ArrayList;

public class CardGame { //new Class CardGame

    ArrayList<Card> deckOfCards = new ArrayList<Card>(); //Array List for deck of cards

    public CardGame() {
        this.deckOfCards = getDeck();
    } //deckof cards equals get deck method

    ArrayList<Card> getDeck(){
        ArrayList<Card> newDeck = new ArrayList<>();
        for (Suit suit : Suit.values()){
            System.out.println(suit.toString());
            for (Symbol symbol : Symbol.values()){
                newDeck.add(new Card(suit, symbol));
                System.out.println(symbol.toString());


            }
        }
        return newDeck;
    }


}

//Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards. This is created and populated when the game is constructed.
//Has a name which is also defined in the constructor.
//Has a getDeck method that lists out the cards in the deck.
//Card
//Has a String suit. Use the unicode characters of heart, club, diamond and spade.
//Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A) = card values// Automatic??
//Has an int value (2,3,4,5,6,7,8,9,10,11,12,13,14) = card values again?

//Has a toString method that describes the class = object printed out

//Tiger tiger = new Tiger();
//System.out.println(tiger.toString());
//right click generate to string return "Name " + this.name + "Color" color of suit, numbers
