package Labo6.src;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tu veux voir le nombre d'apparition de quel nombre: ");
        int x = scan.nextInt();
        System.out.print("Ecris ta série (nombre par nombre): ");
        int y = scan.nextInt();
        int turn = 0;

        while(y != -1) {
            /* On ne mets pas la condition sur le x car non nécessaire.
            Si le voyou mets un nombre négatif à chercher, ca va lui retourner un 0.
            et si il est négatif, il va passer un mauvais quart d'heure.
             */
            if (y < 0) {
                System.out.println("Nombre positif stp");
                System.out.print("Tu veux voir le nombre d'apparition de quel nombre: ");
                x = scan.nextInt();
                System.out.print("Ecris ta série (nombre par nombre): ");
                y = scan.nextInt();
            } else {
                if (x == y) {
                    turn++;
                    System.out.print("Ecris ta série (nombre par nombre): ");
                    y = scan.nextInt();
                } else {
                    System.out.print("Ecris ta série (nombre par nombre): ");
                    y = scan.nextInt();
                }
            }
        }
        System.out.println(turn);
        scan.close();
    }
}
