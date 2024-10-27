package TomasGenomgang;

import java.util.Scanner;

public class RectangleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv höjd");
        int height = scanner.nextInt();
        System.out.println("skriv bredd: ");
        int widht = scanner.nextInt();
        //Skapar en konstruktor
       // skapar objektet som vi sill skriva ut resultatet av
        Rectangle rectangle = new Rectangle(height, widht);
        System.out.println("Arean är : "+rectangle.calculateArea());
        System.out.println("omkretsen är :"+rectangle.calculatePerimeter());

    }
}
