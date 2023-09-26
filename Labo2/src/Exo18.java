package Labo2.src;

import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un 1er nombre: ");
        a = scan.nextInt();
        System.out.print("Entrez un 2eme nombre: ");
        b = scan.nextInt();

        if (a < 0 && b < 0)
            System.out.println("La somme de ces 2 nombres sera un nombre négatif");
        else if (a < 0 && b > 0 && -a < b)
            System.out.println("La somme de ces 2 nombres sera un nombre positif");
        else if (a > 0 && b > 0)
            System.out.println("La somme de ces 2 nombres sera un nombre positif");
        else
            System.out.println("La somme de ces 2 nombres sera un nombre négatif");
    }
}
