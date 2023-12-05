package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo12 {
    public static int max(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int maximum = 0;
        int x;
        int count = 0;
        int place = 0;
        while(it.hasNext()) {
            count++;
            x = it.next();
            if (x > maximum) {
                maximum = x;
                place = count;
            }
        }
        return place;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(9,4,2,45,8,1,45,4,5);
        System.out.println(max(s));
    }
}