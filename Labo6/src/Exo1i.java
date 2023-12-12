package Labo6.src;

import java.util.Scanner;

public class Exo1i {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Donnez la hauteur: ");
        int h = scan.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
        scan.close();
    }
}