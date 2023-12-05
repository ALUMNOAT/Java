package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo10 {
    public static boolean palier(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int number1 = it.next();
        int number2;

        if (!it.hasNext()) {
            throw new RuntimeException("Sequence est vide");
        }

        while (it.hasNext()) {
            number2 = it.next();
            //System.out.println(number2);

            if (number1 == number2) {
                return true;
            }

            number1 = number2;
        }
        return false;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,1,5,7,10,13,20,25);
        System.out.println(palier(s));
    }
}