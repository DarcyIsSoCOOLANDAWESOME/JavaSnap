import org.example.Card;
import org.example.CardGame;
import org.example.Suit;

import java.util.Scanner;

public class Main {
    public static void main() {

        CardGame snap = new CardGame();
//        CardGame shuffle = new shuffleDeck();
        Card myCard =  snap.dealCard();



//        System.out.println(shuffle);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


    }

}
