package Labo2.src;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Entrez un 1er nombre: ");
        a = scan.nextInt();
        System.out.print("Entrez un 2eme nombre: ");
        b = scan.nextInt();

        if (a>b)
            System.out.println("“Le premier est plus grand que le deuxième”");
        else if (a==b)
            System.out.println("“Les deux nombres sont égaux”");
        else
            System.out.println("“Le premier est plus petit que le deuxième”");

        scan.close();
    }
}
