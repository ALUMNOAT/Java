package Labo6.src;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int n = scan.nextInt();
        double x1 = 1, x2 = 1;
        double x3 = x1 + x2;
        System.out.println((int) x1);  // 1
        System.out.println((int) x2);  // 1

        while (x2+x1<n) {
            x3 = x1 + x2;
            x1 = x2;
            x2 = x3;
            System.out.println((int) x3);
        }
        scan.close();
    }
}