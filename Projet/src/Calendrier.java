package Projet.src;

import java.util.*;

public class Calendrier {

    public static int dayOfWeek(int day, int month, int year) {
      return 0;
    }

    public static int daysInMonth(int month, int year) {
        return 0;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else
            return false;
    }

    public static void printDay(int day) {
        return;
    }

    public static void printCalendar(int month, int year) {
        System.out.println("=================================");
        System.out.println();
        String[] day_display = {"Lun","Mar","Mer","Jeu","Ven","Sam","Dim"};
        Hashtable<String, String> month_display = new Hashtable<String, String>();
        month_display.put("01", "Janvier");
        month_display.put("02", "Fevrier");
        month_display.put("03", "Mars");
        month_display.put("04", "Avril");
        month_display.put("05", "Mai");
        month_display.put("06", "Juin");
        month_display.put("07", "Juillet");
        month_display.put("08", "Aout");
        month_display.put("09", "Septembre");
        month_display.put("10", "Octobre");
        month_display.put("11", "Novembre");
        month_display.put("12", "Decembre");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le mois: ");
        int month = scan.nextInt();
        System.out.print("Entrez l'année: ");
        int year = scan.nextInt();
        dayOfWeek(3, month,year);
        daysInMonth(month,year);
        System.out.println(isLeapYear(year));
        printDay(10);
        printCalendar(month,year);
    }
}
