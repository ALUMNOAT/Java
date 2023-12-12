package Labo9.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

import java.util.Scanner;

public class Exo5 {
    public static int compteLongPlateau(SeqInt s, int x) {
        SeqIntIterator it = s.iterator();
        int ans = 0;
        int memes = 1;

        if (it.hasNext()) {
            int nombre = it.next();

            while (it.hasNext()) {
                int pre = nombre;
                nombre = it.next();

                if (nombre == pre) {
                    ++memes;
                } else {
                    if (memes >= x) {
                        ++ans;
                    }
                    memes = 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quelle longueur du plateau maximale? ");
        int x = scan.nextInt();
        SeqInt s = new SeqInt(1, 1, 1, 5, 5, 4, 8, 4, 4, 4, 4, 4, 4, 8, 5, 69, 4);
        System.out.println(compteLongPlateau(s, x));
    }
}