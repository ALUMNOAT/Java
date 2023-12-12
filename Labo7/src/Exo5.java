package Labo7.src;

import java.util.Scanner;

public class Exo5 {
    public static boolean pairNmbre(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(pairNmbre(a));
    }
}
