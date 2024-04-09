public class Exo4 {
    public static int exp(int a, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return a;
        else
            return (a) * exp(a, n-1);
    }

    public static void main(String[] args) {
        System.out.print(exp(2, 24));
    }
}
