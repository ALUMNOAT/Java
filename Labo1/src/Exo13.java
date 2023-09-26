import java.util.Scanner;

public class Exo13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somme = 0;

        for(int i = 1; i <= 4; i++) {
           System.out.print("Veuillez introduire un nombre 4 fois (" + i + " fois): ");
           int nombre = scan.nextInt();
           somme += nombre;
        }  
        System.out.println("La somme de ces 4 nombres est " + somme );
    }
}