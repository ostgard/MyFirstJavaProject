package inlamningsuppgift;

//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit,
//exklusive raden med ordet stop
//

import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {

        int countChars = 0;
        int countRows = 0;

        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println("Skriv in din text här");

        //en loop som körs tills användaren skriver stop
        while (true) {
            text = scanner.nextLine();
            System.out.println("Du skrev in: " + text);
            System.out.println("Du kan fortsätta skriva in mer text, för att avsluta så skriver du: stop");
            if (text.equalsIgnoreCase("stop") || text.equalsIgnoreCase("Stop")) {
                break;
            }

            //jag vill visa en summering av antal tecken och rader efter att while loopen avslutats
            countChars += text.length();
            countRows++;

            System.out.print("Du har skrivit " + countChars + " tecken");
            System.out.println(" och " + countRows + " rader");


        }


    }
}
