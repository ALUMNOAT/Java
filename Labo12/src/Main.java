import java.util.Scanner;

public class Main {
    public static void saisie(Date d) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jour: ");
        d.jour = scan.nextInt();
        System.out.print("Mois: ");
        d.mois = scan.nextInt();
        System.out.print("Année: ");
        d.annee = scan.nextInt();
    }

    public static void saisie(Personne p){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nom de la personne: ");
        p.nom = scan.next();
        System.out.print("Prénom de la personne: ");
        p.prenom = scan.next();
        System.out.print("Date de naissance: ");

        Date ddn = new Date();
        saisie(ddn);

    }

    public static void affiche(Date d){
        System.out.println(d.jour + "/" + d.mois + "/" + d.annee);
    }

    public static void affiche(Personne p){
        System.out.println(p.nom + " " + p.prenom + " ");
        System.out.println(p.ddn);


    }

    public static int compare(Date d1, Date d2){
        if (d1.annee < d2.annee) {
            return d2.annee - d1.annee;
        } else if (d1.annee == d2.annee && d1.mois < d2.mois) {
            return d2.mois - d1.mois;
        } else if (d1.annee == d2.annee && d1.mois == d2.mois && d1.jour < d2.jour) {
            return d2.jour - d1.jour;
        }

        if (d1.annee == d2.annee && d1.mois == d2.mois && d1.jour == d2.jour)
            return 0;

        else
            return Integer.MIN_VALUE;
    }

    public static int compareAge(Personne p1, Personne p2){
        return 0;

    }

    public static int compareNomPrenom(Personne p1, Personne p2){
        return 0;

    }

    public static void main(String[] args) {
        Personne p1 = new Personne();
        Personne p2 = new Personne();
        Date d1 = new Date();
        Date d2 = new Date();

        saisie(d1);
        // saisie(p1);

        // affiche(d1);
        // affiche(p1);

        saisie(d2);
        // saisie(p2);

        // affiche(d2);
        // affiche(p2);

        System.out.println(compare(d1,d2));



    }
}