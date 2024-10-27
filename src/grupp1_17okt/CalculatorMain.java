package grupp1_17okt;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("skriv in ditt första tal ");
        int talet1 = Integer.parseInt(scan.nextLine());
        System.out.println("skriv in ditt andra tal ");
        int talet2 = Integer.parseInt(scan.nextLine());

        Calculator addition = new Calculator(talet1, talet2);
        addition.addition();


    }
}












