public class Exo6 {
    public static int num(int a) {
        if (a < 10)
            return 1;
        return 1 + num(a/10);
    }
    public static void main(String[] args) {
        System.out.print(num(2723));
    }
}
