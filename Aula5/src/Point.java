public class Point {
    private double x;
    private double y;

    public  Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(final double x, final double y){
        this.x=x;
        this.y=y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double distanceTo(Point other) {
        double distance = 0;

        distance = Math.sqrt(Math.pow(other.x- this.x,2) + Math.pow(other.y- this.y,2));

        return distance;
    }
}
