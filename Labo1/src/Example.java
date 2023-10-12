package Labo1.src;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        int a, b, somme;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        somme = a;
        b = scan.nextInt();
        somme = somme + b;
        System.out.println(somme / 2.0);

        scan.close();
        }
}