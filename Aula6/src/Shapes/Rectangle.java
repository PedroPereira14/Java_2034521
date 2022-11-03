package Shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(){
        this.position = new Point();
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(Point topLeftPoint, double height, double width){
        this.position = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getPosition() {
        return position;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return height+height+width+width;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " Top left point: " + this.position.toString() + ", Width: " + this.width + ", Height: " + this.height;
    }
    public boolean containsPoint(Point point){

        Point bottomLeftPoint = new Point(position.getX(), position.getY() - height);
        Point bottomRightPoint = new Point(bottomLeftPoint.getX()+width, bottomLeftPoint.getY());
        Point topRightPoint = new Point(bottomRightPoint.getX(), position.getY());

        if(point.getX() > position.getX() && point.getX() < topRightPoint.getX()
                && point.getY() > bottomLeftPoint.getY() && point.getY() < position.getY()){
            return true;
        }
        else {
            return false;
        }
    }
}
