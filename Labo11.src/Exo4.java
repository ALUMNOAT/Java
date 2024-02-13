package Labo11.src;

import java.util.Scanner;

public class Exo4 {
    public static char Maj(char x) {
        return (char)((int)x - 32);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez un mot, il sera renvoyé en maj: ");
        String x = scan.next();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
                System.out.print(Maj(x.charAt(i)));
            else
                System.out.print(x.charAt(i));
            }

        scan.close();
        }
    }
