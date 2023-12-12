package Labo6.src;

import java.util.Scanner;

public class Exo1h {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Donnez la hauteur : ");
        int h  = scan.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i<=j) {
                    System.out.print('X');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println(' ');
        }
        scan.close();
    }
}