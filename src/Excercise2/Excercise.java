package Excercise2;

import javax.swing.*;

public class Excercise {
    public static void main(String[] args) {
        /*Jämför två tal. om det första är större än det andra
        skriv ut "första talet är störst".
        sam andra talet är störst om det är tvärtom.
         */

        int tal1 = 21;
        int tal2 = 7;

        if (tal1 > tal2)
        {
            System.out.println("första talet är störst");
        }
        if (tal1 < tal2)
        {
            System.out.println("andra talet är störst");
        }

        /*Jämför två tal. Om det första är jämnt delbart med det andra
         skriv ut "jämnt delbart". Annars skriv ut "inte jämnt delbart"
         */

        if (tal1 % tal2 == 0) {
            System.out.println("jämnt delbart");
        } else {
            System.out.println("inte jämnt delbart");
        }
    }
}
