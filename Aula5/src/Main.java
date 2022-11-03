public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point p0 = new Point(1,1);
        Point p1 = new Point(3,1);
        Point p2 = new Point(3,3);
        double distance = p1.distanceTo(p2);
        System.out.println(distance);

        //construtores
        Triangle tr = new Triangle();
        Triangle tr1 = new Triangle(p0,p1,p2);
        Triangle tr2 = new Triangle(new Point(0,0),new Point(3,0),new Point(2,3));

        //modificador
        tr.setA(new Point(10,10));

        //seletor
        Point b = tr2.getB();

        double x = tr2.getC().getX();

        tr1.setABC(new Point(2,2), p0, b);

        double base = tr2.compBase();
        System.out.println(base);

        double alt = tr2.compAlt();
        System.out.println(alt);

        double area = tr2.areaTr();
        System.out.println(area);

        Rectangle rect1 = new Rectangle(new Point(0,3),3,5);

        double arear = rect1.areaRect();
        System.out.println(arear);

        double perimeter = rect1.perimeter();
        System.out.println(perimeter);

        Point p = new Point(2, 3);

        boolean contains = rect1.containsPoint(p);
        System.out.println(contains);
    }
}