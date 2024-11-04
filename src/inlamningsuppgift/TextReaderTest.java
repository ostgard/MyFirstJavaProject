package inlamningsuppgift;


//Till programmet skall minst tre Junit-testfall skrivas
//Testfallen skall skilja sig märkvärt åt och testa olika delar
// av programmet

//testa att skriva bokstäver, att åäö funkar
//testa att antalet ord räknas rätt
//testar antalet rader-räknare fungerar


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextReaderTest {

    @Test
    @DisplayName("testar antalet rader")
    void testOfRows() {
        TextCounter textCounter = new TextCounter();

        textCounter.addLine("första raden");
        textCounter.addLine("andra raden");
        textCounter.addLine("tredje raden");

        //Vill få ett felaktigt test, så skrev expected 2 istf förväntade 3
        assertEquals(2, textCounter.getCountRows());
    }

    @Test
    @DisplayName("Testar antal ord räknaren")
    void testWordCount() {
        TextCounter textCounter = new TextCounter();

        // Testfall 1: En enkel rad med fyra ord
        String line1 = "Det här är ett test";
        int wordCount1 = textCounter.countWords(line1);
        assertEquals(5, wordCount1, "Antalet ord borde vara 4 för raden: 'Det här är ett test'");

    }

    @Test
    @DisplayName("Testar Å-Ä-Ö")
    void testSwedishChars(){
        TextCounter textCounter = new TextCounter();
        String line2 = "Löksås är jättegott i Värmland";
        int wordCount1 = textCounter.countWords(line2);
        assertEquals(5, wordCount1, "Antalet ord borde vara 5 för raden: 'Löksås är jättegott i Värmland'");

    }
}

