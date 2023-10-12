package Labo2.src;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        a = scan.nextInt();

        if (a<=10 && a>=1)
            System.out.println("Le nombre possède une valeur de 1 à 10.");
        else
            System.out.println("Le nombre ne possède pas une valeur de 1 à 10.");

        scan.close();
    }
}
