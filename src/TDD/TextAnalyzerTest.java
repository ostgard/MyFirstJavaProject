package TDD;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static junit.framework.TestCase.assertEquals;

public class TextAnalyzerTest {

    @Test
    void numberOfRows(){
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        TextAnalyzer.lineInput("hej på er klassen");
        TextAnalyzer.lineInput("hej på dig Tomas");
        TextAnalyzer.lineInput("hej på er alla andra också");
        assertEquals(3, textAnalyzer.getRows());


    }
}
