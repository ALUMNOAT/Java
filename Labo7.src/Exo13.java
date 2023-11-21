package Labo7.src;

import java.util.Scanner;

public class Exo13 {
    public static void carre(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print('X');
            }
            System.out.println(' ');
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        carre(a);
    }
}
