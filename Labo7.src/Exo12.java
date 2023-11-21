package Labo7.src;

import java.util.Scanner;

public class Exo12 {
    public static boolean estPremier(int a) {
        int compteur = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                compteur++;
            }
        }

        return compteur == 2;
    }

    public static int compte(int a) {
        int nombres = 0;

        for (int i = 0; i <= a; i++) {
            if (estPremier(i)) {
                nombres++;
            }
        }

        return nombres;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(compte(a));
    }
}