public class Exo5 {
    public static int exp(int a, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return a;
        if (n % 2 == 0)
            return exp((a*a),n/2);
        else
            return a * exp((a), (n-1));
    }

    public static void main(String[] args) {
        System.out.print(exp(2, 10));
    }
}