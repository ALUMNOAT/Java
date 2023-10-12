package Labo2.src;

import java.util.Scanner;

public class Exo13 {
    public static void main(String[] args) {
        int hour;
        int minutes;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez l'heure seulement: ");
        hour = scan.nextInt();
        System.out.print("Entrez les minutes: ");
        minutes = scan.nextInt();

        while ((hour >= 24 || hour < 0) || (minutes < 0 || minutes > 60)) {
            System.out.println("Vous etes un clown. Recommencez");
            System.out.print("Entrez l'heure seulement: ");
            hour = scan.nextInt();
            System.out.print("Entrez les minutes: ");
            minutes = scan.nextInt();
        }

        if (minutes == 59)
            System.out.println((int)(hour + 1) + ":00");
        else if (minutes >=0 && minutes <=  9)
            System.out.println(hour + ":0" + (int)(minutes + 1));
        else
            System.out.println(hour + ":" + (int)(minutes + 1));

        scan.close();
    }
}
