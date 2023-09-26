package Labo2.src;

import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        int forfait = 250;
        int freeKm = 50;
        int n, x;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nombre de jours de location du véhicule: ");
        n = scan.nextInt();
        System.out.print("Nombre de Km parcourus avec la voiture: ");
        x = scan.nextInt();

        if (x > freeKm && x <= 450 + freeKm) {  // 500km - 50 = 450 km
            System.out.println("Pour " + n + " jours et " + x + " Km parcourus, vous devez payer:");
            System.out.println(((forfait * n) + ((x - freeKm) * 1.25)) + " euros");
        }
        else if (x > 450 + freeKm) {  // 550km - 50 = 500km   (1 jour et 501km)
            System.out.println("Pour " + n + " jours et " + x + " Km parcourus, vous devez payer:");
            System.out.println(((forfait*n)+((x-freeKm)*1.25))+(((x-(450+freeKm))*1.25)*(10d/100d))+" euros");
            //System.out.println(((forfait * n) + ((x - freeKm) * 1.25))); //813.75
            //System.out.println(1.25*10d/100d); //0.125
            // 250 + (451*1.25) + (1km*1.25)*(10/100)
            // 250 + 563.75 + 0.125 = 813.875€
        }
        else if (x <= 0 && n <=0)
            System.out.println("T'as pas loué la voiture");
        else {
            System.out.println("Pour " + n + " jours et " + x + " Km parcourus, vous devez payer:");
            System.out.println((forfait * n) + " euros");
        }
    }
}
