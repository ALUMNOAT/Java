public class Exo7 {
    public static int num(int a) {
        if (a < 10)
            return a;
        return a % 10 + num(a/10);
    }
    public static void main(String[] args) {
        System.out.print(num(2723));
    }
}