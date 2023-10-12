package Labo1.src;

import java.util.Scanner;
 
public class Exo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Valeur de a: ");
        a = scan.nextInt();
        System.out.print("Valeur de b: ");
        b = scan.nextInt();
 
        double moyenneArithm = (double) (a + b) / 2;
        System.out.print("La moyenne arithmétique de a et b est: ");
        System.out.println(moyenneArithm);

        scan.close();
    }
}