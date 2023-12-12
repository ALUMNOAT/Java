package Labo6.src;

import java.util.Scanner;

public class Exo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int n = scan.nextInt();
        double x1 = 1, x2 = 1;
        double x3 = x1 + x2;
        boolean rep = false;

        while (x2+x1<=n) {
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
            double dernier = x3;
            // System.out.println((int) x3);

            if (dernier == n){
                rep = true;
            } else {
                rep = false;
            }
        }
        System.out.println(rep);
        scan.close();
    }
}