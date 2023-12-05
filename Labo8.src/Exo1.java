package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo1 {
    public static boolean vide(SeqInt s) {
        SeqIntIterator it = s.iterator();
        return !it.hasNext();
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt();
        System.out.println(vide(s));
    }
}