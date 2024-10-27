package homeAssignments;

public class ManyJavaTasks {
    public static void main(String[] args) {

       /* 3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        blir omvandlat till minuter resp sekunder.*/

        int hours = 4;
        int hoursInMinutes;
        int hoursInSeconds;

        hoursInMinutes = hours * 60;
        System.out.print(hours + " timmar är " + hoursInMinutes + " minuter");

        System.out.println();

        hoursInSeconds = hours * 60 * 60;
        System.out.print(hours + " timmar är " + hoursInSeconds + " sekunder");



        /*4. Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
        av de tre talen.*/

        int number1 = 3;
        int number2 = 4;
        int number3 = 5;
        int sum;
        int average;


        sum = number1 + number2 + number3;
        System.out.println();
        System.out.println();
        System.out.println("summan av de tre talen är " + sum);

        average = sum / 3;
        System.out.println("medelvärdet av de tre talen är " + average);

       /* 5. Läs in ett heltal motsvarande svenska kronor och skriv ut motsvarande värde i pund
        respektive dollar. Antag att kursen är : 1 dollar = 6 kr, 1 pund = 10 kr.*/

        int SEK = 100;
        int USD;
        int GBP;

        USD = SEK / 6;
        GBP = SEK / 10;
        System.out.println();
        System.out.println(SEK + " kronor är " + USD + " dollar");
        System.out.println(SEK + " kronor är " + GBP + " brittiska pund");

        /*6. Skapa ett program som beräknar funktionen ax3 + 7 och skriver ut resultatet. Variablerna
        a och x ska läsas in.*/

        int a = 4;
        int x = 5;

        sum = (a * x * 3) + 7;
        System.out.println();
        System.out.println("ax3+7 är = " + sum);

        /*7. Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
        liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala*/

        System.out.println();

        int litre = 2;
        int pricePerLitre = 25;
        int sum3 = litre * pricePerLitre;

        int discountInPercent = 10;
        sum3 = sum3 - (sum3 * discountInPercent/100);
        System.out.print(sum3 +" kronor är priset för bensinen, med avdragen rabatt");


        /*8. Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in.*/

        int height = 20;
        int length = 5;
        int circumference;
        int area;

        circumference = height*2 + length * 2;
        System.out.println();
        System.out.println();
        System.out.println("omkretsen på rektangeln är " +circumference);

        area = height*length;
        System.out.println("arean på rektangeln är " +area);


        /*9. Skapa ett program där en cirkels radie läses in. Cirkelns diameter, omkrets och area
        skall beräknas och skrivas ut. (pi = 3.14).*/

        double radius = 2;
        double diameter;
        double circumference2;
        double area2;

        diameter = 2 *radius;
        circumference2 = diameter * 3.14;
        area2 = 3.14 * radius*radius;

        System.out.println();
        System.out.println("cirkelns diameter är " + diameter);
        System.out.println("cirkelns area är " + area2);
        System.out.println("Cirkelns omkrets är " + circumference2);

//fail

        /*10.Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9C / 5 + 32.
        Skapa ett program där en temperatur i Fahrenheit läses in och motsvarande temperatur
        i Celsius skrivs ut.*/




    }
}
