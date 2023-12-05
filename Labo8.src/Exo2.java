package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo2 {
    public static int length(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int lap = 0;
        while(it.hasNext()) {
            lap++;
            it.next();
        }
        return lap;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(9,4,2,1,1,1,4,4);
        System.out.println(length(s));
    }
}