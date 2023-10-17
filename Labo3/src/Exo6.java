package Labo3.src;

import java.util.Scanner;

class Exo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, nombre;
        
        System.out.print("Entrez un nombre: ");
        nombre = scan.nextInt();
        
        while ((i+1)*(i+1) < nombre) {
            i++;
            System.out.print(i);
        }

        scan.close();
    }
}