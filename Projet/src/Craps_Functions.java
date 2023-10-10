package Projet.src;

import java.util.Random;
import java.util.Scanner;

public class Craps_Functions {

    public class TestRandom {
        public static final Random GENERATEUR = new Random();
        public static void main(String[] args) {
            for(int i = 0; i < 10; ++i)
                System.out.print(GENERATEUR.nextInt(6) + 1 + " ");
            System.out.println();
        }
    }
    public static int lancerUnDe() {
        return 0;
    }

    public static void afficherDes(int de1, int de2) {
        return;
    }

    public static int saisirMise(int nbjetons) {
        return nbjetons;
    }

    public static boolean joueETGagneUnTourDeCraps() {
        return false;
    }

    public static void main(String[] args) {
        lancerUnDe();
        afficherDes(1,2);
        saisirMise(10);
        joueETGagneUnTourDeCraps();

    }
}



