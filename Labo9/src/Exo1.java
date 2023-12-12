import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo1 {
    public static int Plateau(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int groupes = 0;

        if (it.hasNext()) {
            int nombre = it.next();
            groupes = 1;
            while (it.hasNext()) {
                int pre = nombre;
                nombre = it.next();
                if (nombre != pre) {
                    ++groupes;
                }
            }
        }

        return groupes;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,1,1,5,4,8,4,4,4,4,4,4,8,5,69,4);
        System.out.println(Plateau(s));
    }
}