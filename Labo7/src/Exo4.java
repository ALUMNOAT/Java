package Labo7.src;

import java.util.Scanner;

public class Exo4 {
    public static boolean negatifNmbre(int a) {
        return a < 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(negatifNmbre(a));
    }
}
