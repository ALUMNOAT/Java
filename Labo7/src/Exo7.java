package Labo7.src;

import java.util.Scanner;

public class Exo7 {
    public static int puissNmbre(int a, int b) {
        int somme = 1;

        for (int i = 0; i < b; i++) {
            somme *= a;
        }

        return somme;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(puissNmbre(a,b));
    }
}
