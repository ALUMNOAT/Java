package Labo6.src;

import java.util.Arrays;
import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez une serie des nombres (un par un, 0 pour terminer): ");
        int x = scan.nextInt();
        int min = 0, max = 0, turn = 0;

        while(x != 0) {
            if (x < 0) {
                System.out.println("Nombre positif stp");
                System.out.print("Ecrivez une serie des nombres (un par un, 0 pour terminer): ");
                x = scan.nextInt();
            } else {
                if (turn == 0) {
                    min = x;
                    max = x;
                    turn++;
                    System.out.print("Ecrivez une serie des nombres (un par un, 0 pour terminer): ");
                    x = scan.nextInt();
                } else if (turn != 0 && x>min && x<max) {
                    System.out.print("Ecrivez une serie des nombres (un par un, 0 pour terminer): ");
                    x = scan.nextInt();
                } else if (turn != 0 && x<min){
                    min = x;
                    System.out.print("Ecrivez une serie des nombres (un par un, 0 pour terminer): ");
                    x = scan.nextInt();
                } else {
                    max = x;
                    System.out.print("Ecrivez une serie des nombres (un par un, 0 pour terminer): ");
                    x = scan.nextInt();
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scan.close();
    }
}