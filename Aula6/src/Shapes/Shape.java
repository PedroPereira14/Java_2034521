package Shapes;

public abstract class Shape {
    protected Point position;

    public Shape(){
        this.position = new Point();
    }

    public Shape(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
