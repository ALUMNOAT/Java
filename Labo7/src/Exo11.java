package Labo7.src;

import java.util.Scanner;

public class Exo11 {
    public static boolean estPremier(int a) {
        int compteur = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                compteur++;
            }
        }

        return compteur == 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(estPremier(a));
    }
}
