package org.example;
import java.util.Scanner;

public class Snap extends CardGame {
    public Snap() {

        Players players = new Players("Player 1", "Player 2");

        System.out.println(players.getPlayerOne() +
                " vs " +
                players.getPlayerTwo());

        System.out.println("Press Enter to Start and draw a card");

        Card previousCard = null;

        boolean playerOneTurn = true;

        Scanner scanner = new Scanner(System.in);

        while(true){

            if (playerOneTurn) {
                System.out.println(players.getPlayerOne() + "'s turn");
            } else {
                System.out.println(players.getPlayerTwo() + "'s turn");
            }

            scanner.nextLine();

            Card dealtCard = dealCard();
            System.out.println(dealtCard);

            if (previousCard != null) {

                if (dealtCard.getNumValue() == previousCard.getNumValue()) {

                    if (playerOneTurn) {
                        System.out.println(players.getPlayerOne() + " won. SNAP!");
                    } else {
                        System.out.println(players.getPlayerTwo() + " won. SNAP!");
                    }

                    break;
                }

                if (dealtCard.getSymbol() == previousCard.getSymbol()) {

                    if (playerOneTurn) {
                        System.out.println(players.getPlayerOne() + " won. SNAP!");
                    } else {
                        System.out.println(players.getPlayerTwo() + " won. SNAP!");
                    }

                    break;
                }
            }

            previousCard = dealtCard;

            playerOneTurn = !playerOneTurn;
        }

    }

}
