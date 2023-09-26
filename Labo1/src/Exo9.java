import java.util.Scanner;
 
public class Exo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Valeur de a: "); // 1
        a = scan.nextInt();
        System.out.print("Valeur de b: "); // 2
        b = scan.nextInt();
        System.out.print("Valeur de c: "); // 3
        c = scan.nextInt();
        System.out.print("Valeur de d: "); // 4
        d = scan.nextInt();
 
        int temp1 = a; // 1
        int temp2 = b; // 2
 
        a = d;      // a = 4
        b = c;      // b = 3
        c = temp2;  // c = 2
        d = temp1;  // d = 1
 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}