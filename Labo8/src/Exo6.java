package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo6 {
    public static int max(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int maximum = 0;
        int x;
        while(it.hasNext()) {
            x = it.next();
            if (x > maximum) {
                maximum = x;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(9,4,2,45,8,1,0,4,5);
        System.out.println(max(s));
    }
}