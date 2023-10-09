package Labo3;

import java.util.Scanner;
 
class Exo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n, nombre;
        int i = 0;
        double somme = 0;
        System.out.print("Combien de nombres voulez vous entrer? : ");
        n = scan.nextInt();
        
        while(n<=0) {
            System.out.println("T'es un marrant, recommence.");
            System.out.print("Combien de nombres voulez vous entrer? : ");
            n = scan.nextInt();
        }
        
        
        while(i<n) {
            System.out.print("Entrez le nombre (" + (int) (n - i) + " nombres restants): ");
            nombre = scan.nextInt();
            somme += nombre;
            i++;
        }
        
        System.out.println("La moyenne algebrique est " + (somme / n));
        
    }
}