package TomasGenomgang;

public class Rectangle {
    private int height, widht; //attributen vi behöver

    //Konstruktor
    public Rectangle(int heightInput, int widhtInput) {
        height = heightInput;
        widht = widhtInput;
    }

    public int calculateArea() {
        return height * widht;
    }

    public int calculatePerimeter() {
        return (height + widht) * 2;
    }




}
