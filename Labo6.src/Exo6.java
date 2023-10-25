package Labo6.src;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Donnez un nombre: ");
        int x = scan.nextInt();
        System.out.print("Multiplier par combier: ");
        int y = scan.nextInt();
        int somme = 0;

        if (x == 0 || y == 0) {
            System.out.println("0");
            System.exit(0);
        } else if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
            for (int i = 0; i < Math.abs(y) ; i++) {
                somme += Math.abs(x);
            }
        } else {
            for (int i = 0; i < Math.abs(y) ; i++) {
                somme -= Math.abs(x);
            }
        }

        System.out.println(somme);
        scan.close();
    }
}