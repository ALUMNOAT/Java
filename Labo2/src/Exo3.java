import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre (sa valeur absolue sera renvoyé): ");
        a = scan.nextInt();

        if (a >= 0)
            System.out.println(a);
        else
            System.out.println(-a);
    }
}
