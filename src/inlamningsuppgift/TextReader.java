package inlamningsuppgift;

//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit,
//exklusive raden med ordet stop

//Här är klassen som läser in text och skriver ut resultatet till användaren

import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextCounter textCounter = new TextCounter(); //En instans av TextCounter

        int totalWords = 0; //variable för att hålla koll på antal ord

        String line;

        do {
            System.out.println("Skriv in din text här");
            line = scanner.nextLine();

            if (!line.contains("stop")) {  //en loop som körs så länge användaren inte skriver stop
                String text = line; //variabeln text, behövdes tydligen inte :D
                textCounter.addLine(line);

                int wordCount = textCounter.countWords(line);
                totalWords += wordCount; //Lägger till radens antal ord

                textCounter.setLongestWord(line);

                //System.out.println("Du skrev in: " + text);
                System.out.println("Du kan fortsätta skriva in mer text, för att avsluta så skriver du: stop");


            }
        }
        while (!line.contains("stop"));
        System.out.println("Programmet avslutades när du skrev ordet stop");
        System.out.print("Du har skrivit " + textCounter.getCountChars() + " tecken");
        System.out.println(" på " + textCounter.getCountRows() + " rader");
        System.out.println("Totalt antal ord: " + totalWords);
    //Jag får inte till längsta ordet
       System.out.println("Det längsta ordet är: " + textCounter.getLongestWord());

    }
}





