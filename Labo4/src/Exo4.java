package Labo4.src;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de nombres:  ");
        int n = scan.nextInt();
        int petit = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ecrivez les nombres: ");
            int nombres = scan.nextInt();

            if (nombres < petit)
                petit = nombres;
        }

        System.out.println("Plus petit nombre = " + petit );

        scan.close();
    }
}
