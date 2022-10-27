public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
        this.a = new Point(0,0);
        this.b = new Point(0,0);
        this.c = new Point(0,0);
    }

    public Triangle(Point a, Point b, Point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setABC (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double compBase(){
        return a.distanceTo(b);
    }
    public double compAlt(){
        return a.distanceTo(c);
    }
    public double areaTr(){
        return (compBase()*compAlt())/2;
    }
}
