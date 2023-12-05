package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo16 {
    public static int[] ecart(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int valeur1 = 0, valeur2 = 0, gap = 0, somme = 0;
        int[] res = new int[4];
        res[0] = valeur1;
        res[1] = valeur2;
        res[2] = gap;
        res[3] = somme;
        int number1 = it.next();
        int number2;

        if (!it.hasNext()) {
            throw new RuntimeException("Sequence est vide");
        }

        while (it.hasNext()) {
            number2 = it.next();
            //System.out.println(number2);
            
            if (number1 < 0 && number2 < 0){
                int reverse1 = -number1;
                res[3] = Math.abs(reverse1+number2);
            } else if (number1 >= 0 && number2 >= 0) {
                res[3] = Math.abs(number1-number2);
            } else if (number1 < 0) {
                int reverse1 = -number1;
                res[3] = Math.abs(reverse1+number2);
            } else {
                res[3] = Math.abs(number1-number2);
            }

            if(res[3] > res[2]) {   //if(somme > gap)
                res[2] = res[3];    //gap = somme
                res[0] = number1;   //valeur1 = number1
                res[1] = number2;   //valeur2 = number2
            }

            number1 = number2;
        }

        return res;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(-1,5,-11,5,4,1,4,1,4,-859,0,454,787,1,12,0);
        int[] res = ecart(s);
        System.out.println("Valeur 1 : " + res[0]);
        System.out.println("Valeur 2 : " + res[1]);
        System.out.println("L'ecart est de "+ res[2]);
    }
}