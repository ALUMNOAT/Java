import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo7 {
    public static int comptePlateauxLongueurUn(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int ans = 1;

        if (it.hasNext()) {
            int nombre = it.next();

            while (it.hasNext()) {
                int pre = nombre;
                nombre= it.next();

                if (nombre != pre) {
                    ++ans;
                } else {
                    --ans;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1, 2, 3, 4, 4, 6, 7, 8, 9, 10);
        System.out.println(comptePlateauxLongueurUn(s));
    }
}