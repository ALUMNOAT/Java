package Labo2.src;

import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un 1er nombre: ");
        a = scan.nextInt();
        System.out.print("Entrez un 2eme nombre: ");
        b = scan.nextInt();
        System.out.print("Entrez un 3eme nombre: ");
        c = scan.nextInt();

        System.out.println("Les nombres en ordre croissant: ");
        if (a<b && a<c && b<c)
            System.out.print(a + ", "+ b + ", "+ c);
        else if (a<b && a<c && c<b)
            System.out.print(a + ", "+ c + ", "+ b);
        else if (b<a && b<c && a<c)
            System.out.print(b + ", "+ a + ", "+ c);
        else if (b<a && b<c && c<a)
            System.out.print(b + ", "+ c + ", "+ a);
        else if (c<a && c<b && b<a)
            System.out.print(c + ", "+ b + ", "+ a);
        else
            System.out.print(c + ", "+ a + ", "+ b);
    }
}
