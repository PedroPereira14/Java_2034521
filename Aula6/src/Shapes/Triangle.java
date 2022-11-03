package Shapes;

public class Triangle extends Shape{
    private Point b;
    private Point c;

    public Triangle(){
        position = new Point(0,0);
        this.b = new Point(0,0);
        this.c = new Point(0,0);
    }

    public Triangle(Point a, Point b, Point c){
        this.position = a;
        this.b=b;
        this.c=c;
    }

    public Point getPosition() {
        return position;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setABC (Point a, Point b, Point c){
        this.position = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        return (compBase()*compAlt())/2;
    }

    @Override
    public double getPerimeter() {
        double width = compBase();
        double height = compAlt();
        double hipo = c.distanceTo(b);
        double perimeter = hipo + width + height;
        return perimeter;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " A: " + this.position.toString() + ", B: " + this.b.toString() + ", C: " + this.c.toString();
    }


    public double compBase(){
        return position.distanceTo(b);
    }
    public double compAlt(){
        return position.distanceTo(c);
    }
}
