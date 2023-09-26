package Labo2.src;

import java.util.Scanner;

public class Exo15 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        a = scan.nextInt();

        if (a > 0) {
            if (a == 1)
                System.out.println("a vaut 1");
        }

        if (a <= 0)
            System.out.println("a est inférieur ou égal à 0");
    }
}
