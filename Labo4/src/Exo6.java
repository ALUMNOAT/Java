package Labo4.src;

import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de nombres:  ");
        int n = scan.nextInt();
        double somme = 0;
        int div = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ecrivez les nombres: ");
            int nombres = scan.nextInt();

            if (nombres > 0) {
                somme += nombres;
                div += 1;
            }
        }

        System.out.println("Moyenne = " + somme/div );

        scan.close();
    }
}
