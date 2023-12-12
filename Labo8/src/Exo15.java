package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo15 {
    public static int[] MaxMin(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int[] res = new int[2];
        int number = it.next();
        res[0] = number;    //min
        res[1] = number;    //max

        if (!it.hasNext()) {
            throw new RuntimeException("Sequence est vide");
        }

        while(it.hasNext()) {
            number = it.next();

            if(number < res[0]) {
                res[0] = number;
            } else if(number > res[1]) {
                res[1] = number;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(-1,5,-11,5,4,1,4,1,4,-85,0,454,787,1,12,0);
        int[] res = MaxMin(s);
        System.out.println("Min = " + res[0]);
        System.out.println("Max = " + res[1]);
    }
}