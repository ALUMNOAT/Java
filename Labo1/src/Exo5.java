package Labo1.src;

import java.util.Scanner;
 
public class Exo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Valeur de a: ");
        a = scan.nextInt();
        System.out.print("Valeur de b: ");
        b = scan.nextInt();
 
        int somme = a + b;
        System.out.print("La somme de a et b est: ");
        System.out.println(somme);
    }
}