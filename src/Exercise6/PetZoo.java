package Exercise6;

public class PetZoo {
    public static void main(String[] args) {
        Pet dog = new Pet("Fido");
        Pet cat = new Pet("missan");
        Pet rabbit = new Pet("coco");

        //Använd denna metod ifrån klassen PetZoo på dina tre nyligen skapade objekt

       /* dog.printName();
        cat.printName();
        rabbit.printName();*/

        //Skapa en ny metod i klassen Pet som skriver ut returnerar attributet name
        //Använd denna metod ifrån klassen PetZoo på dina tre nyligen skapade objekt och spara värdet i en variabel

        String dogName = dog.getName();
        String catName = cat.getName();
        String rabbitName = rabbit.getName();


        //Skriv ut namnen två gånger ifrån PetZoo

        for (int i=0;i<2;i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);
        }

    }



}
