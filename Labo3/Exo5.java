package Labo3;

import java.util.Scanner;
 
class Exo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, somme = 0, nombre;
        
        while (true) {
            System.out.print("Entrez le nombre un par un (entrez '-1' pour arreter): ");
            nombre = scan.nextInt();
 
            if (nombre == -1) {
                break;
            } else if (nombre >= 0) {
                somme += nombre;
                i++;
            } else {
                System.out.print("NOMBRE POSITIF FDP (entrez '-1' pour arreter): ");
            }
        }
 
        System.out.print("La moyenne arithemique est: " + (somme / i));
    }
}
