package Labo7.src;

import java.util.Scanner;

public class Exo6 {
    public static int multiNmbre(int a, int b) {
        int somme = 0;

        if (b < 0) {
            b = -b;
            a = -a;
        }

        for (int i = 0; i < b; i++) {
            somme += a;
        }

        return somme;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(multiNmbre(a,b));
    }
}

/*      if (b > 0) {
            for (int i = 0; i < b; i++) {
                somme += a;
            }
        } else {
            for (int i = 0; i > b; i--) {
                somme -= a;
            }
        }
 */
