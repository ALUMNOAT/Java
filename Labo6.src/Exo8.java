package Labo6.src;

import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Mettez le nombre à chercher: ");
        int x = scan.nextInt();
        System.out.print("Entrez la serie: ");
        int y = scan.nextInt();
        int index = 1;

        do {
            System.out.print("Entrez la serie: ");
            y = scan.nextInt();
            index++;
        } while(y!=x);

        System.out.println(index);

        scan.close();
    }
}
