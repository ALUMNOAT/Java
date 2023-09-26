package Labo1.src;

import java.util.Scanner;
 
public class Exo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Valeur de a: "); // 1
        a = scan.nextInt();
        System.out.print("Valeur de b: "); // 2
        b = scan.nextInt();
        System.out.print("Valeur de c: "); // 3
        c = scan.nextInt();
 
        int temp = a; // 1
        a = c; // a=3
        c = temp; // c=1
 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
 
    }
}