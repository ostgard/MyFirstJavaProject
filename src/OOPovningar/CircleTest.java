package OOPovningar;

/*      7. Skapa en klass Circle. Konstruktorn ska ta in
        radien som ett attribut.
        8. Skapa en metod calculateArea som returnerar
        cirkelns area. r*r * pi (pi = 3.14) alt. MATH.PI
        9. Skapa en metod calculateCircumference som
        returnerar cirkelns omkrets. 2*r*pi
        Skriv Enhetstest
        10. Skapa ett objekt i din main-metod och skriv ut
        arean och omkretsen. */


import Circle.Circle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    @DisplayName("Test av cirkelns area när radien är 10")

        //Skapa en metod för att testa det här,
        // eftersom det inte ska returneras något så skriver vi void
        // eftersom det är en metod så sätter man parenteser efter,
        //Måsvingarna innehåller ett kodblock som tillhör koden area

    void testOfCircleAreaRadius10() {

        //objekt med en variabel
        //Skapar min lokala objekt cirkel
        Circle circle = new Circle(10);
        //klassen  //mitt lokala objekt      //anrop av konstruktor


        //verifieringen av att arean av en cirkel med radie10= 314
        assertEquals(314,circle.calculateArea());
    }

    @Test
    @DisplayName("Test av cirkelns area när radien är 5")
    void testOfCircleAreaRadius5() {
        Circle circle = new Circle(5);
        assertEquals(78.5,circle.calculateArea());
    }


    @Test
    @DisplayName("Test av cirkelns area när radien är 7.5")
    void testOfCircleAreaRadius7dot5() {
        Circle circle = new Circle(7.5);
        assertEquals(176.625,circle.calculateArea());
    }

}
