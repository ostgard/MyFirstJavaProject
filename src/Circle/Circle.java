package Circle;

public class Circle {

    double radie; //klassens variabel, en variabel som är ett Attribut

    //konstruktor med argument in //inparameter
    public Circle(double r) {
        radie = r;


    }

    public double calculateArea() {
        return radie*radie*3.14;
    }
}
