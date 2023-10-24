package Labo6.src;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de nombres en tout dans la suite: "); //limite 47
        int n = scan.nextInt();
        double x1 = 1, x2 = 1;
        double x3;
        System.out.println((int) x1);  // 1
        System.out.println((int) x2);  // 1

        for (int i = 3; i <= n; i++) {
            x3 = x1 + x2;
            System.out.println((int) x3);
            x1 = x2;
            x2 = x3;
        }
        scan.close();
    }
}