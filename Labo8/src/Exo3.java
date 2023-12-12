package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo3 {
    public static int somme(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int res = 0;
        while(it.hasNext()) {
            res += it.next();
        }
        return res;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(9,4,2,1,1,1,4,4);
        System.out.println(somme(s));
    }
}