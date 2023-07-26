public class Main {
    public static void main(String[] args) {
        // Test code for Point class
        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 1);
        Point point = new Point(0, 0);
        System.out.println("distance(0,0)= " + point1.distance());
        System.out.println("distance(second)= " + point1.distance(point2));
        System.out.println("distance(2,2)= " + point1.distance(2, 2));
        System.out.println("distance()= " + point.distance());
    }
}