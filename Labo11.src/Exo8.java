package Labo11.src;

import java.util.Scanner;

public class Exo8 {
    public static boolean palindrome(String a) {
        boolean x = true;

        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == (char)32)
                a.charAt(i) = (char)8;
            else
                continue;
        }
        
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
        String a = scan.nextLine();

        System.out.println(palindrome(a));

        scan.close();
    }
}