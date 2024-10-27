package Excercise4;

public class ForLoop {
    public static void main(String[] args) {
        //Skriv ut alla tal från 1-100

        //Med for loop
        System.out.println("numbers 1-100");
        for (int i=0;i<100;i++){
            System.out.print((i+1) + " ");
        }


        //Skriv ut alla jämna tal ifrån 1-100
        System.out.println();
        System.out.println();
        System.out.println("even numbers 1-100");

        for (int i = 0; i<100; i+=2){
            System.out.print((i+2) + " ");
        }

        //Skriv ut alla fibonacci-tal från 1-100

        System.out.println();
        System.out.println();
        System.out.println("fibonacci numbers 1-100");
        int first = 1;

        System.out.print(first + " ");

        int second = 1;

        for(int i=0; i<10; i++){
            System.out.print(second + " ");
            int third = first + second;
            first = second;
            second =  third;
        }

    }
}


