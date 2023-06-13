package solid.srp;

public class Square {


    private int side;
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

}
