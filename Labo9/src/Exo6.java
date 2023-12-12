import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo6 {
    public static int compteLongPlateau(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int ans = 0;
        int memes = 1;

        if (it.hasNext()) {
            int nombre = it.next();

            while (it.hasNext()) {
                int pre = nombre;
                nombre = it.next();

                if (nombre == pre) {
                    ++memes;
                } else {
                    if (memes == 3) {
                        ++ans;
                    }
                    memes = 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1, 1, 1, 5, 4, 8, 4, 4, 4, 4, 4, 4, 8, 5, 69, 4);
        System.out.println(compteLongPlateau(s));
    }
}