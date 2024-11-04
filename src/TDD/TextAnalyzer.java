package TDD;

public class TextAnalyzer {
    private static int rows;

    public void TextAnalyzer(){
        rows = 0;
    }
    public static void lineInput(String line) {
        rows++;


    }

    public int getRows() {
        return rows;

    }
}
