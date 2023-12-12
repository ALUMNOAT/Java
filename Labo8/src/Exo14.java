package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo14 {
    public static int maxNega(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int min = Integer.MIN_VALUE;              //-2147483648
        int number;
        int compteurBoucle = 0;

        if (!it.hasNext()) {
            throw new RuntimeException("Sequence est vide");
        }

        while(it.hasNext()) {
            number = it.next();

            if(number > min && number < 0) {
                min = number;
                compteurBoucle++;
            }
        }
        if(compteurBoucle == 0) {
            throw new RuntimeException("Il y a que des nombres positifs dans la séquence, donc pas de maximum négatif");
        }

        return min;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(1,5,1,5,4,1,4,1,4,85,0);
        System.out.println(maxNega(s));
    }
}