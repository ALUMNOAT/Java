package Labo4.src;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de nombres:  ");
        int n = scan.nextInt();
        double somme = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ecrivez les nombres: ");
            int nombres = scan.nextInt();
            somme += nombres;
        }

        System.out.println("Moyenne = " + somme/n );

        scan.close();
    }
}
