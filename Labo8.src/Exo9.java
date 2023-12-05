package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

/* *****************
 2 retours mais bon, j'sais pas comment faire
 * *****************/

public class Exo9 {
    public static boolean croissant(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int number1 = it.next();
        int number2;

        if (!it.hasNext()) {
            throw new RuntimeException("Sequence est vide");
        }

        while (it.hasNext()) {
            number2 = it.next();
            //System.out.println(number2);

            if (number1 > number2) {
                return false;
            }

            number1 = number2;
        }
        return true;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(7,1,1,7,10,15,20,25);
        System.out.println(croissant(s));
    }
}