import java.util.Random;
import java.util.Scanner;

public class TestRandom {

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Bienvenue dans le jeu de Craps");
        System.out.println("================================");
        System.out.println(" ");

        Scanner scan = new Scanner(System.in);
        int coins = 10;

        for (int i = 0; i < 10;i++) {
            int turn = i+1;
            int bet;

            if (bet == 0)
            System.out.println("Tour nr " + turn +": ");
            System.out.println("Vous avez " + coins +" jetons.");
            System.out.println("Combien voulez vous miser ? (0 pour arrêter)");
            bet = scan.nextInt();

            if (coins < bet) {
                System.out.println("Vous essayez de rouler le casino. Recommencez.");
                System.out.println(" ");
            } else {
                coins -= bet;
            }

            Random dice = new Random();
            int x = dice.nextInt(6) + 1;
            int y = dice.nextInt(6) + 1;
            int somme = x + y;
            System.out.println("Vous avez lancé " + x + " et " + y + ". La somme est " + somme + ".");

            if (turn == 1 && (somme == 7 || somme == 11)) {
                System.out.println("Gagné !");
            } else if (turn == 1 && (somme == 2 || somme == 3 || somme == 12)) {
                System.out.println("Perdu !");
            }

        }

    }
}
