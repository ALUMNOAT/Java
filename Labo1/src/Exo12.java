package Labo1.src;

import java.util.Scanner;
 
public class Exo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int DepartHeure, DepartMinutes, FinHeure, FinMinutes;
        System.out.print("Heure de départ (seulement l'heure): "); // 5
        DepartHeure = scan.nextInt();
        System.out.print("Minutes de départ: "); // 50
        DepartMinutes = scan.nextInt();
        System.out.print("Heure d'arrivée (seulement l'heure): "); // 9
        FinHeure = scan.nextInt();
        System.out.print("Minutes d'arrivée: "); // 20
        FinMinutes = scan.nextInt();
 
        int DiffHeure = FinHeure - DepartHeure;
        int DiffMinutes = FinMinutes - DepartMinutes;
 
        if (DiffMinutes < 0) {
            DiffHeure--;
            DiffMinutes = 60 + DiffMinutes;  // + car DiffMinutes est négatif
        }
 
        System.out.print("La durée de l'évènement était de " + DiffHeure + " heure(s) et " + DiffMinutes + " minute(s).");

        scan.close();
    }
}