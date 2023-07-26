public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(Object object) {
        if (object instanceof Point) {
            Point point = (Point) object;
            return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
        } else {
            return -1;
        }
    }

    public double distance(int a, int b) {
        return Math.sqrt(Math.pow(a - this.x, 2) + Math.pow(b - this.y, 2));
    }
}
