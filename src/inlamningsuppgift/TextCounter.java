package inlamningsuppgift;

//En klass som räknar raderna, antal tecken och antal ord

public class TextCounter {

    //två variabler
    private int countChars;
    private int countRows;

    //fler variabler, del3 av övningen
    // private String longestWord = "";

    //jag vill visa en summering av antal tecken och rader efter att while loopen avslutats

    //En konstruktor som kan hålla siffrorna för rader och tecken, ord
    public TextCounter() {
        countChars = 0;
        countRows = 0;
    }

    //Räknar raderna i en metod:
    public void addLine(String line) {
        countRows++;
        countChars += line.length();
    }

    public int getCountRows() {
        return countRows;
    }

    public int getCountChars() {
        return countChars;
    }

    //Del 3, fortsättning
//    Håller koll på antal ord (separerade med blanksteg), i en array list
    public int countWords(String line) {
        String[] words = line.split(" ");
        return words.length;
    }

//    Skriver ut det längsta ordet
//    public String getLongestWord(){
//        return longestWord;
//    }

//    Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i den andra ”logik-klassen”

}

