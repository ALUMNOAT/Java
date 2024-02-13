package Labo11.src;

public class Exo2 {
    public static void main(String[] args) {
        char x = '8';

        if ((int)x >= (int)'A' && (int)x <= (int)'Z')
            System.out.println("Le charactere est une majuscule");
        else
            System.out.println("Le charactere n'est pas une majuscule");
    }
}
