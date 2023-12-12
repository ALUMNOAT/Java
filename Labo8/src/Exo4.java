package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;
import java.util.Scanner;

public class Exo4 {
    public static int count(SeqInt s, int x) {
        SeqIntIterator it = s.iterator();
        int clock = 0;
        while(it.hasNext()) {
            if (it.next() == x) {
                clock++;
            }
        }
        return clock;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quel nombre vous voulez rechercher? : ");
        int x = scan.nextInt();
        SeqInt s = new SeqInt(9,4,2,1,1,1,4,4);
        System.out.println(count(s,x));
    }
}