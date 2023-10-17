package Labo4.src;

import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez la base du nombre: ");
        int a = scan.nextInt();
        System.out.print("Entrez l'exposant du nombre: ");
        int b = scan.nextInt();
        double puissance = a;

        while (a == 0 && b == 0) {
            System.out.println("Impossible. Mettez d'autres nombres");
            System.out.print("Entrez la base du nombre: ");
            a = scan.nextInt();
            System.out.print("Entrez l'exposant du nombre: ");
            b = scan.nextInt();
            puissance = a;
        } if (b < 0) {
            for (int i = -1; i > b; i--) {
                puissance /= a;
            }
        } else {
            for (int i = 1; i < b; i++) {
                puissance *= a;
            }
        }

        System.out.println(a + "^" + b + " est égale = " + puissance);

        System.out.println(Math.pow(a,b));

        scan.close();
    }
}
