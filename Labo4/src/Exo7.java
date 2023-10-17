package Labo4.src;

import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorielle = 1;
        System.out.print("Entrez un nombre: ");
        int x = scan.nextInt();

        while (x < 0) {
            System.out.println("Nombre positif stp");
            System.out.print("Entrez un nombre: ");
            x = scan.nextInt();
        }

        for (int i = 0; i < x; i++) {
            int partie = (x-i);
            factorielle *= partie;
        }

        System.out.println("Factorielle de " + x + " = " + factorielle);

        scan.close();
    }
}
