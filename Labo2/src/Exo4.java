import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.print("Entrez un 1er nombre: ");
        a = scan.nextInt();
        System.out.print("Entrez un 2eme nombre: ");
        b = scan.nextInt();

        if (a<b)
            System.out.println("Résultat = " + (int) (b-a));
        else
            System.out.println("Résultat = " + (int) (a-b));
    }
}
