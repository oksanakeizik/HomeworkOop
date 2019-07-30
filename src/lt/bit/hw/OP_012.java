package lt.bit.hw;

/*
 * LT Parašykite programą, kuri realizuoja įvairių geometrinių figūrų (kvadratas, apskritimas ir t.t.)
 * ploto skaičiuoklę. Kuriant paprogrames turi būti panaudotas paprogramių perkrovimo (Overload) mechanizmas.
 * EN Write a program that implements an area calculator for various geometric shapes (square, circle, etc.).
 * Subprograms must be created using the Overload mechanism.
 */

public class OP_012 {
    private void calculateArea(float x) {

        System.out.println("Area of the squre: " + x * x + " sq units");
    }

    private void calculateArea(float x, float y) {

        System.out.println("Area of rectangle: " + x * y + " sq unuts");
    }

    private void calculateArea(double r) {
        double area = 3.14 * r * r;
        System.out.println("Area of the circle: " + area + " sq units");
    }

    public static void main(String[] args) {
        OP_012 obj = new OP_012();
        obj.calculateArea(3.0f);
        obj.calculateArea(3, 7);
        obj.calculateArea(6.1);
    }
}
