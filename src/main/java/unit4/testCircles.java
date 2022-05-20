package unit4;

public class testCircles {
    public static void main(String[] args) {
        Circle c1 = new Circle(4.5);
        Circle c2 = new Circle(4.5);

        boolean isEqual = c1 == c2;
        System.out.println(isEqual);

        boolean isEqual2 = c1.getRadius() == c2.getRadius();
        System.out.println(isEqual2);
    }
}
