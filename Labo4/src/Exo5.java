package Labo4.src;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de nombres:  ");
        int n = scan.nextInt();
        int positif = 0, negatif = 0, nul = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ecrivez les nombres: ");
            int nombres = scan.nextInt();

            if (nombres < 0)
                negatif++;
            else if (nombres == 0)
                nul++;
            else
                positif++;
        }

        System.out.println("positifs: " + positif);
        System.out.println("négatifs: " + negatif);
        System.out.println("nulles: " + nul);

        scan.close();
    }
}
