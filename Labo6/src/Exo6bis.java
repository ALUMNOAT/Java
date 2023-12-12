package Labo6.src;

import java.util.Scanner;

public class Exo6bis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Donnez un nombre: ");
        int x = scan.nextInt();
        System.out.print("Multiplier par combier: ");
        int y = scan.nextInt();
        int somme = 0;

        for (int i = 0; i < y || i > y; i++) {  //mdr pour la loop
            if (x != 0) {
                somme += x;
            }
        }

        System.out.println(somme);
        scan.close();
    }
}