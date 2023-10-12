package Labo3;

import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre, firstnumber = 0, i = 0, lastnumber = 0;

        while (true) {
            i++;
            System.out.print("Entrez le nombre un par un (entrez '-1' pour arreter): ");
            nombre = scan.nextInt();

            if (nombre == -1) {
                break;
            } else if (nombre >= 0 && i == 1) {
                firstnumber = lastnumber = nombre;
            } else if (nombre >= 0) {
                lastnumber = nombre;
            } else {
                System.out.print("NOMBRE POSITIF FDP (entrez '-1' pour arreter): ");
            }

        }

        if (firstnumber < lastnumber)
            System.out.print("Le premier est inférieur au dernier");
        else if (i == 1 && firstnumber == lastnumber)  //d'abord cette condition car sinon le 1er = 2eme et ca m'arrange pas
            System.out.print("La suite est vide");
        else if (firstnumber == lastnumber)
            System.out.print("Le premier est égal au dernier");
        else
            System.out.print("Le premier est supérieur au dernier");

        scan.close();
    }
}