package Labo6.src;

import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mettez le nombre à chercher: ");
        int x = scan.nextInt();
        System.out.print("Entrez la serie: ");
        int y = scan.nextInt();
        int index = 1;
        int compteur = 1;

        do {
            System.out.print("Entrez la serie: ");
            y = scan.nextInt();
            index++;
            compteur++;
            if (y == x) {
                compteur = 0;
            }
        } while(y != -1);

        System.out.println(index-compteur);

        scan.close();
    }
}