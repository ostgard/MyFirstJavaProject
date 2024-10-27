package homeAssignments;

// 13.Skapa ett program som läser in ett tal och skriver ut om det är jämnt. (Använd
// modulooperatorn)


import java.util.Scanner;

public class ManyJavaTasks2 {
    public static void main(String[] args) {
//Skapa ett program där två tal läses in och det första talet skrivs ut om det är störst.

        Scanner scannerinput;
        scannerinput = new Scanner(System.in);

        System.out.println("skriv in ditt första tal");
        int tal1 = scannerinput.nextInt();

        System.out.println("skriv in ditt andra tal");
        int tal2 = scannerinput.nextInt();

        if (tal1 > tal2) {
            System.out.println("första talet " + tal1 + " är större än andra talet " + tal2);
        }


        // 12.Läs in två tal. Testa om det första talet är mer än dubbelt så stort som det andra talet. I så
// fall ska meddelandet “För stort“ skrivas ut.

     //   Scanner scannerInput = new Scanner(System.in);

       // System.out.println("skriv in ditt första tal ");
        //int number1 = scannerInput.nextInt()

    }
}
