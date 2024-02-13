package Labo11.src;

import java.util.Scanner;

public class Exo3 {
    public static Boolean Minuscule(char x) {
        return x >= 'a' && x <= 'z';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez un mot: ");
        String x = scan.next();
        boolean rep = false;

        for (int i = 0; i < x.length(); i++) {
            if (!Minuscule(x.charAt(i))) {
                rep = false;
                break;
            } else
                rep = true;
        }
        if (rep)
            System.out.println("Minuscules");
        else
            System.out.println("Pas en minuscules");

        scan.close();
    }
}
