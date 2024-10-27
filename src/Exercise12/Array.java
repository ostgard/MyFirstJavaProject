package Exercise12;
//Skapa ett program som innehåller en array med fem namn
//Skriv ut det första och det sista


public class Array {
    public static void main(String[] args) {

        // String[] names = {"Julia", "Elina", "Erika", "Peter", "Tokyo"};


        String[] names = new String[5];

        names[0] = "Julia";
        names[1] = "Elina";
        names[2] = "Erika";
        names[3] = "Peter";
        names[4] = "tokyo";

        System.out.println(names[0]);
        System.out.println(names[4]);

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);

        }

        String myString = "hej på dig";

        String[] stringArray = myString.split(" ");

        for (int i = 0; i < 3; i++) {
            System.out.println(stringArray[i]);

        }
    }

}
