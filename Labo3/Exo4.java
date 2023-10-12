package Labo3;

import java.util.Scanner;
 
class Exo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre, i = 0, somme = 0;
        System.out.print("Entrez un nombre: ");
        nombre = scan.nextInt();
        
        while ((somme + i) < nombre) {
            i++;
            somme += i;
        }
 
        System.out.print(i);

        scan.close();
    }
}