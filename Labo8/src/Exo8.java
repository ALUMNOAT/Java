package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;
import java.util.Scanner;

public class Exo8 {
    public static int count(SeqInt s, int x) {
        SeqIntIterator it = s.iterator();
        int clock = 0;
        int place = 0;
        while (it.hasNext()) {
            clock++;
            if (it.next() == x && place == 0) {
                place = clock;
            }
        }
        return place;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quel nombre vous voulez rechercher? : ");
        int x = scan.nextInt();
        SeqInt s = new SeqInt(1,1,2,7,1,8,4,8);
        System.out.println("La premiere position du nombre "+x+" est: "+count(s,x));
    }
}