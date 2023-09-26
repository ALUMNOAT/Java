package Labo1.src;

import java.util.Scanner;
 
public class Exo4 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 valeurs entières:");
        a = scan.nextInt(); // 5
        b = scan.nextInt(); // 7
 
        int nmbreMemoire = a; // 5
        a = b;  // a = 7
        b = nmbreMemoire; // b = 5
 
        System.out.print("Les voici inversées: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }
}