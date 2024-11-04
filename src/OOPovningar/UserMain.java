package OOPovningar;

import java.util.Arrays;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        //int antalRader = 0;
        //Lägg in Tomas TextAnalyzer rader i det här programmet
        //på tre ställen tror jag, här och längst ner.

        do {
            // (kommenterar ut)antalRader++;
            System.out.println("skriv in användarnamn och lösenord separerade med blanksteg");
            line = scanner.nextLine();
            if (!line.contains("stop")) {
                String[] array = line.split(" ");
                System.out.println(Arrays.toString(array));
                System.out.println("Ditt anvädarnamn är " + array[0]);
                System.out.println("Ditt lösenord är " + array[1]);
                int sumAntalTecken = line.length(); //en metod som hämtar längden, sparas in en variablen sumAntaltecken som är angiven som en int i raden ovan
                System.out.println(sumAntalTecken);
            }
            if (line.contains("stop")) System.out.println("tack och hej");
        } while (!line.contains("stop"));
        //(kommenterar ut)System.out.println(antalRader);
    }
}
