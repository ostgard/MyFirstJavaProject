package Excercise3;

public class WhileLoop {
    public static void main(String[] args) {

        //Skriv ut alla tal från 1-100

        //Med while loop
        System.out.println("numbers 1-100");
        int number = 1;

        while (number <= 100) {
            System.out.print(number + " ");
            number++;
        }

        //Skriv ut alla jämna tal ifrån 1-100
        System.out.println();
        System.out.println();
        System.out.println("even numbers 1-100");
        int even = 2;

        while (even <=100) {
            System.out.print(even + " ");
            even += 2;
        }

        //Skriv ut alla fibonacci-tal från 1-100

        System.out.println();
        System.out.println();
        System.out.println("fibonacci numbers 1-100");
        int first = 1;

        System.out.print(first + " ");

        int second = 1;

        while (second <=100){
            System.out.print(second + " ");

            int third = first + second;
            first = second;
            second =  third;

        }




    }
}
