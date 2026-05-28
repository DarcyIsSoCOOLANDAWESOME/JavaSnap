package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;


public class CardGame implements ActionListener {

    ArrayList<Card> deckOfCards = new ArrayList<Card>();

    public CardGame() {
        this.deckOfCards = getDeck();
        shuffleDeck();
        gameTimer = new Timer(10, this);
        System.out.println("The card at the top of the deck is " + deckOfCards.get(0));
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
