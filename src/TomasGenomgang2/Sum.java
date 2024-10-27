package TomasGenomgang2;

import java.util.Scanner;

public class Sum {
    //44.Skapa ett program som låter användaren bestämma hur många tal han vill summera. Läs in
    //detta antal tal och summera dem Skriv ut summan.

    static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("hur många tal vill du läsa in? ");
        int antalTal = scannerInput.nextInt();
        System.out.println();
        System.out.println(antalTal);

        int sum = 0;
        for (int i = 0; i < antalTal; i++) {
            System.out.print("Skriv in ett tal ");
            int tal = scannerInput.nextInt();
            sum = sum + tal;
            System.out.println();
        }
        System.out.println("summan av dina " + antalTal + " tal är " + sum);
    }

    //ny metod
    //Läs in ett tal och returnera talet tillbaka

   /* static int sumInteger(int numberOfIntegers) {
        int sum = 0;
        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.print("Skriv in ett tal ");
            int tal = scannerInput.nextInt();
            sum = sum + tal;
            System.out.println(); */

        }


