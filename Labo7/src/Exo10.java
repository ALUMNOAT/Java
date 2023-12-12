package Labo7.src;

import java.util.Scanner;

public class Exo10 {
    public static boolean estMultiple(int a, int b) {
        return a % b == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(estMultiple(a,b));
    }
}
