package Labo1.src;

import java.util.Scanner;
 
public class Example2 {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer une valeur:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Vous avez entrée la valeur: ");
        System.out.println(a);
    }
}