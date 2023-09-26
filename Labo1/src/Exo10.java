package Labo1.src;

import java.util.Scanner;
 
public class Exo10 {
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
        int temp2 = b; // 2
        int temp3 = c; // 3
 
        a = d;      // a=4
        b = temp1;  // b=1
        c = temp2;  // c=2
        d = temp3;  // d=3
 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}