package solid;

import solid.srp.Square;
import solid.srp.SquareDrow;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(side);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        SquareDrow squareDrow = new SquareDrow(side);
        squareDrow.draw();
        squareDrow.zoom(1.5f);
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
        squareDrow.draw();
    }
}
