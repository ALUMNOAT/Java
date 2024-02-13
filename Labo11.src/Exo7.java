package Labo11.src;

import java.util.Scanner;

public class Exo7 {
    public static boolean palindrome(String a) {
        boolean x = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(a.length() - (1+i)))
                continue;
            else
                x = false;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez un mot : ");
        String a = scan.next();

        System.out.println(palindrome(a));

        scan.close();
    }
}
