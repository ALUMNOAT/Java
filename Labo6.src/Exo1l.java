package Labo6.src;

import java.util.Scanner;

public class Exo1l {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Donnez la hauteur: ");
        int h = scan.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (h-i); k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        scan.close();
    }
}