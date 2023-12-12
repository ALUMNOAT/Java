package Labo7.src;

import java.util.Scanner;

public class Exo9 {
    public static double factNmbre(int a) {
        double somme = 1;

        for (int i = 2; i <= a; i++) {
            somme *= i;
        }

        return somme;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(factNmbre(a));
    }
}

/*  public static double factNmbre(int a) {
        double somme = 1;

        for (int i = 0; i < a; i++) {
            somme *= (a-i);
        }

        return somme;
    }
 */
