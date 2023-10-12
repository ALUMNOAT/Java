package Labo2.src;

import java.util.Scanner;

public class Exo16 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez une année pour voir si elle est bissextile: ");
        a = scan.nextInt();

        if ((a % 100) != 0 || ((a % 4) == 0 && (a % 400) == 0 ))  // 2200 comme exemple conditions: false ou (true et false) = false ===> false  
            System.out.println("L'année " + a + " est bissextile");
        else
            System.out.println("L'année " + a + " n'est pas bissextile");

        scan.close();
    }
}
