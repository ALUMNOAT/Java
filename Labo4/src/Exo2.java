package Labo4.src;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int x = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + x + " = " + i*x);
        }

        scan.close();
    }
}
