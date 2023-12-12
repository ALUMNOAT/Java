package Labo7.src;

import java.util.Scanner;

public class Exo2 {
    public static double calculMoyenne(int a, int b) {
        return (double) (a+b)/2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(calculMoyenne(a,b));
    }
}
