package TomasGenomgang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void calculateArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12, rectangle.calculateArea());
    }

    @Test
    void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(3,4);
        assertEquals(13, rectangle.calculateArea());
    }
}