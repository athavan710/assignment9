public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point difference(Point point) {
        double newX = this.getX() - point.getX();
        double newY = this.getY() - point.getY();
        return new Point(newX, newY);

    }

    public void DisplayCoordinate() {
        System.out.println("The x coordinate is " + x + "." + "The y coordinate is " + y);
    }

    public double Distance(Point point) {
        double distanceX = point.getX() - this.getX();
        double distanceY = point.getY() - this.getY();
        return Math.sqrt((Math.pow(distanceX, 2)) + Math.pow(distanceY, 2));

    }

    public double Slope(Point point) {
        return (point.getY() - this.getY()) / (point.getX() - this.getX());

    }

    public double yIntercept(Point point) {
        double slope = Slope(point);
        return y - (slope * x);
    }

    public void linearEquation(Point point) {
        double slope = Slope(point);
        double yIntercept = yIntercept(point);
        System.out.println("y = " + slope + "x" + " + " + yIntercept);

    }

    public Point midPoint(Point point) {
        double midpointX = (this.getX() + point.getX()) / 2;
        double midpointY = (this.getY() + point.getY()) / 2;
        return new Point(midpointX, midpointY);

    }

    public Point sum(Point point) {
        double newX = this.getX() + point.getX();
        double newY = this.getY() + point.getY();
        return new Point(newX, newY);
    }

}
