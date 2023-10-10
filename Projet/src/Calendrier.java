package Projet.src;

public class Calendrier {

    public static int dayOfWeek(int day, int month, int year) {
      return 0;
    }

    public static int daysInMonth(int month, int year) {
        return 0;
    }

    public static boolean isLeapYear(int year) {
        return true;
    }

    public static void printDay(int day) {
        return;
    }

    public static void printCalendar(int month, int year) {
        System.out.println("=================================");

    }

    public static void main(String[] args) {
        dayOfWeek(3,5,2022);
        daysInMonth(10,2022);
        isLeapYear(2000);
        printDay(10);
        printCalendar(10,2000);
    }
}
