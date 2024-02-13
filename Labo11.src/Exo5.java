package Labo11.src;

import java.util.Scanner;

public class Exo5 {
    public static int nbrAppa(char a, char x) {
        int rep = 0;
        if ((int) a ==  (int) x)
            rep++;
        return rep;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez le mot : ");
        String a = scan.next();
        System.out.print("Ecrivez la lettre pour compter le nombre d'apparition : ");
        String x = scan.next();


        for (int i = 0; i < a.length(); i++) {
            System.out.print(nbrAppa(a.charAt(i), x.charAt(0)));
        }

        scan.close();
    }
}
