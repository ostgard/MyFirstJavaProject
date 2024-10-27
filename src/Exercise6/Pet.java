package Exercise6;

public class Pet {


    private String name;    //attribut

    public Pet(String petName) { //konstruktor
        name = petName;
    }


    //Skapa en ny metod i klassen Pet som skriver ut attributet name
    public void printName() {
        System.out.println("the name of the pet is: " +name);
    }

    public String getName() {
        return name;
    }
}
