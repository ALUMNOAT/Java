package Labo2.src;

import java.util.Scanner;

public class Exo9 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un 1er nombre: ");
        a = scan.nextInt();
        System.out.print("Entrez un 2eme nombre: ");
        b = scan.nextInt();
        System.out.print("Entrez un 3eme nombre: ");
        c = scan.nextInt();

        System.out.print("Le plus grand nombre d'entre ces 3 est: ");
        if (a>b && a>c)
            System.out.println(a);
        else if (b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);

        scan.close();
    }
}
