import java.util.Scanner;

public class Exo12 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un 1er nombre: ");
        a = scan.nextInt();
        System.out.print("Entrez un 2eme nombre: ");
        b = scan.nextInt();
        System.out.print("Entrez un 3eme nombre: ");
        c = scan.nextInt();

        if (a == b || a == c)
            System.out.println("Un nombre se répète: "+ a);
        else if (b == c)
            System.out.println("Un nombre se répète: "+ b);
    }
}
