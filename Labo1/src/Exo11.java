package Labo1.src;

import java.util.Scanner;
 
public class Exo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Valeur de a: "); // 1
        a = scan.nextInt();
        System.out.print("Valeur de b: "); // 2
        b = scan.nextInt();
        System.out.print("Valeur de c: "); // 3
        c = scan.nextInt();
        System.out.print("Valeur de d: "); // 4
        d = scan.nextInt();
 
        int temp1 = a; // 1
 
        a = b;      // a=2
        b = c;      // b=3
        c = d;      // c=4
        d = temp1;  // d=1
 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}