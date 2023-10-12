package Projet.src;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.exit;

public class Craps_Spaghetti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Bienvenue dans le jeu de Craps");
        System.out.println("================================");

        ///////////////
        // initialisation variables globales
        ///////////////

        int coins = 10;
        int bet = 0;
        int turn = 0;
        int goal = 0;
        Random dice = new Random();

        //////////////
        // Tour n°1
        /////////////

        while (coins - bet >= 0) {
            turn++;
            System.out.println(" ");
            System.out.println("tour " + turn);
            System.out.println(" ");
            System.out.println("Vous avez " + coins +" jetons.");
            System.out.print("Combien voulez vous miser ? (0 pour arrêter) ");

            bet = scan.nextInt();

            while (bet > coins) {
                System.out.println("Vous essayez de rouler le casino. Recommencez.");
                System.out.println(" ");
                System.out.println("Vous avez " + coins +" jetons.");
                System.out.println("Combien voulez vous miser ? (0 pour arrêter)");
                bet = scan.nextInt();
            } if (bet == 0) {
                System.out.println("A bientot !");
                exit(0);
            } else {
                coins -= bet;
            }

            int x = dice.nextInt(6) + 1;
            int y = dice.nextInt(6) + 1;
            int somme = x + y;
            System.out.println("Vous avez lancé " + x + " et " + y + ". La somme est " + somme + ".");

            if (somme == 7 || somme == 11 && turn == 1) {
                System.out.println("Gagné !");
                System.out.println(" ");
                coins += (bet * 2) + 1;
            } else if (somme == 2 || somme == 3 || somme == 12 && turn == 1) {
                System.out.println("Perdu !");
                System.out.println(" ");
            } else if (coins == 0) {
                System.out.println("Perdu ! T'as plus de monaaayyyyy!!!!!");
                exit(0);
            } else {

                //////////////////////////
                // grosse loop pour lancer
                /////////////////////////

                goal = somme;
                System.out.println("Votre but est " + goal + ".");
                while (coins != 0) {
                    x = dice.nextInt(6) + 1;
                    y = dice.nextInt(6) + 1;
                    int total = x + y;
                    System.out.println("Vous avez lancé " + x + " et " + y + ". La somme est " + total + ".");
                    coins -= bet;
                    if (total == goal) {
                        System.out.println("Gagné !");
                        System.out.println(" ");
                        coins += bet * 2;
                        break;
                    } else if (total == 7) {
                        System.out.println("Perdu !");
                        System.out.println(" ");
                        break;
                    } else if (coins == 0) {
                        System.out.println("Perdu ! T'as plus de monaaayyyyy!!!!!");
                        exit(0);
                    }
                }
            }
        }
        scan.close();
    }
}