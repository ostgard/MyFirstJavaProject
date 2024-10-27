package OOPovningar;

public class Fruit {
    public String color;


    //Kunde behövt skriva public, eller public void här med, men det är default

    public Fruit(String firstColor){
        color = firstColor;
    }

    public void setColor(String newColor) {
   color= newColor;
    }

    public String getColor() {
        return color;
    }
}
