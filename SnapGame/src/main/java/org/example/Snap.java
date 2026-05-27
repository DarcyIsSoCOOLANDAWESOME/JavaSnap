package org.example;
import java.util.Scanner;

public class Snap extends CardGame {
    public Snap() {

        //When the user presses enter the game starts
        //Each time enter is pressed a new card is dealt
        //The game continues (a loop?) if two cards != same
        //when 2 cards = the same, the game ends.
        System.out.println("Press Enter to Start and draw a card");
        while(true){

            Scanner scanner = new Scanner(System.in);

            scanner.nextLine();
            shuffleDeck();
            Card dealtCard = dealCard();
            System.out.println(dealtCard);

            System.out.println();

            if(dealtCard.getNumValue() == deckOfCards.get(deckOfCards.size() -2).getNumValue()){
                System.out.println("You won. Snap!");
            }
        }




    }



}
