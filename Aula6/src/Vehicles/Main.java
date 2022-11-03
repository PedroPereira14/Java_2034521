package Vehicles;

import Shapes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car c1 = new Car();

        Vehicle v1 = new Car();

        Car c2 = new Car(1997, "Ford", "Monde", 2559,"Black",5);

        Motorcycle m1 = new Motorcycle(2004, "Honda", "Civic Mobile", 2000, "White", 2);

        System.out.println(c2.toString());
        c2.drive();
        System.out.println(m1.toString());
        m1.drive();

        Figure figure = new Figure();

        Point p = new Point(10,10);
        System.out.println(p.toString());

        Triangle tr = new Triangle(new Point(0,0), new Point(3,0), new Point(0,3));
        Rectangle rt = new Rectangle(new Point(0,0), 100, 100);

        figure.add(tr);
        figure.add(rt);

        ArrayList<Point> points = new ArrayList<Point>();

        for(Point point: points){

        }

        for (Shape shape: figure.getShapes()){
            double area = shape.getArea();
            double perimeter = shape.getPerimeter();

            System.out.println(shape.toString());
            System.out.println("\t Area: " + area + ", Perimeter " + perimeter);
        }
    }
}