package Labo11.src;

import java.util.Scanner;

public class Exo6 {
    public static char reverse(String a) {
        char x = 0;
        for (int i = 0; i < a.length(); i++) {
            x = a.charAt(a.length() - (1+i));
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez un mot : ");
        String a = scan.next();

        System.out.println(reverse(a));

        scan.close();
    }
}
