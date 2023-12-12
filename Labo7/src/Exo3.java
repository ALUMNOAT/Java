package Labo7.src;

import java.util.Scanner;

public class Exo3 {
    public static double calculMax(int a, int b) {
        /* Math.max() existe du coup pas
        besoin de faire la fonction mais bon */

        int max = a;

        if (a < b){
            max = b;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((int) calculMax(a,b));
    }
}
