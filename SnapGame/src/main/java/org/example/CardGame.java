package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;


public class CardGame implements ActionListener { //new Class CardGame

    ArrayList<Card> deckOfCards = new ArrayList<Card>(); //Array List for deck of cards

    public CardGame() {
        this.deckOfCards = getDeck();
        gameTimer = new Timer(10, this);
        System.out.println("The card at the top of the deck is " + deckOfCards.get(0));
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
    public Card dealCard(){
        if(deckOfCards.isEmpty()){
            return null;
        }
        return deckOfCards.removeFirst();
    }

    public ArrayList<Card> sortDeckIntoSuits(){
    deckOfCards.sort(
            (card1, card2) -> {
                int suitCompare = card1.getSuit().compareTo(card2.getSuit());

                if(suitCompare == 0){
                    return card1.getNumValue() - card2.getNumValue();
                }
                return suitCompare;
            }
    );
    return deckOfCards;
}


    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }

    Timer gameTimer;


    @Override
    public void actionPerformed(ActionEvent e) {

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
