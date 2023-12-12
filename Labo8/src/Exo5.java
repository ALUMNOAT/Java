package Labo8.src;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exo5 {
    public static double moyenne(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int somme = 0;
        int compteur = 0;

        while(it.hasNext()) {
            compteur++;
            somme += it.next();
        }

        if (compteur == 0) {
            throw new RuntimeException("C'est vide");
        }

        return (double) somme/compteur;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(4,8,19,5,4,7,9);
        System.out.println(moyenne(s));
    }
}