package Labo3;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre, lastnumber = 0;

        while (true) {
            System.out.print("Entrez le nombre un par un (entrez '-1' pour arreter): ");
            nombre = scan.nextInt();

            if (nombre == -1) {
                break;
            } else if (nombre >= 0) {
                lastnumber = nombre;
            } else {
                System.out.print("NOMBRE POSITIF FDP (entrez '-1' pour arreter): ");
            }
        }

        System.out.print("Le dernier nombre est: " + lastnumber);    //??????????
    }
}
