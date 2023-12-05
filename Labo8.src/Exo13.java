package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo13 {
    public static int palier(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int number1 = it.next();
        int number2;
        int count = 0;

        if (!it.hasNext()) {
            throw new RuntimeException("Sequence est vide");
        }

        while (it.hasNext()) {
            number2 = it.next();
            //System.out.println(number2);

            if (number1 == number2) {
                count++;
            }

            number1 = number2;
        }
        return count;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,1,1,7,10,13,13,25);
        System.out.println(palier(s));
    }
}