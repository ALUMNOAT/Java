package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;
import java.util.Scanner;

public class Exo7 {
    public static int count(SeqInt s, int x) {
        SeqIntIterator it = s.iterator();
        int clock = 0;
        int place = 0;
        while(it.hasNext()) {
            clock++;
            if (it.next() == x) {
                place = clock;
            }
        }
        return place;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quel nombre vous voulez rechercher? : ");
        int x = scan.nextInt();
        SeqInt s = new SeqInt(9,4,2,7,1,1,4,8);
        SeqInt t = new SeqInt(1,5,7,4,4,5,2,4);
        System.out.println("La derniere position du nombre "+x+" est: "+count(s,x));
        System.out.println("La derniere position du nombre "+x+" est: "+count(t,x));
    }
}