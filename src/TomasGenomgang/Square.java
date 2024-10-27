package TomasGenomgang;

public class Square {

    public static void main(String[] args) {
        //Skapa ett program som skriver ut kvadraten på ett tal som läses in. Kvadrat är talet
        // multiplicerat med sig själv.
/*
        int heltal = 10;
        double decimaltal = 1.5;
        int resultatHeltal = heltal * heltal;
        double resultDecimaltal = decimaltal * decimaltal;
        String text = "";
        char tecken = 'a';
        System.out.println("kvadraten av heltalet " + heltal + "blir " + resultatHeltal);
        System.out.println("kvadraten av decimaltalet " + decimaltal + " är: " + resultDecimaltal);


        //En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        //Försäljningssumman ska läsas in. */

     /*   Plain Text
import java.util.Scanner;
        public class uppgift2_java {
            public static void main(String[] args) {
                Scanner readingIn = new Scanner(System.in);*/
             /*   int salary = 8000;
                double percent = 0,09;
               // System.out.println("Type count of months for calucalting:");
                //int period = Integer.parseInt(readingIn.nextLine());
                int calucate = salary * period * percent / 100;
                System.out.println("Din bonus blir efter " + period + " månader med vinst på " + calucate);
            } */
    }
//Pierres kod
/*import java.util.Scanner;

    public class uppgift2_java {
        public static void main(String[] args) {
            Scanner readingIn = new Scanner(System.in);
            int salary = 8000;
            int percent = 9;
            System.out.println("Type count of months for calucalting:");
            int period = Integer.parseInt(readingIn.nextLine());
            int calucate = salary * period * percent / 100;
            System.out.println("Din bonus blir efter " + period + " månader med vinst på " + calucate);
        }
    }
}*/

    int salary = 8000;
    int percent = 9;
    int period = 3;
    int calucate = salary * period * percent / 100;

}
