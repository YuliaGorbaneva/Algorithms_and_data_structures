package Seminar1;

public class House {

    public String street;

    public int floorCount;

    public Color color;

    public int height;

    public void burn() {
        floorCount = 1;
        color = Color.Black;
        height = 3;
    }

    public void print() {
        System.out.println("Steet" + street);
    }

    public House() {
        this(1);
    }

    public House(int _floorCount) {
        if (_floorCount < 1) {
            floorCount = 1;
        }
        floorCount = _floorCount;
    }
}

enum Color {
    White, Black, Red, Yellow, Green
}