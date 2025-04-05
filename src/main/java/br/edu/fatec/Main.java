package br.edu.fatec;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl shapeFactoryImpl = new ShapeFactoryImpl();

        Calculable square = shapeFactoryImpl.getShape(ShapeType.Square, new Double[]{4.0});
        System.out.println("Square area: "+square.calculateArea());

        Calculable rectangle = shapeFactoryImpl.getShape(ShapeType.Rectangle, new Double[]{5.0 , 7.0});
        System.out.println("Rectangle area: "+rectangle.calculateArea());

        Calculable circle = shapeFactoryImpl.getShape(ShapeType.Circle, new Double[]{4.0 , 2.0});
        System.out.println("Circle area: "+ circle.calculateArea());

        Calculable triangle = shapeFactoryImpl.getShape(ShapeType.Triangle, new Double[]{5.0 ,7.0});
        System.out.println("Triangle area: "+triangle.calculateArea());

        Calculable parallelogram = shapeFactoryImpl.getShape(ShapeType.Parallelogram, new Double[]{8.0 , 3.0});
        System.out.println("Parallelogram area: " + parallelogram.calculateArea());

        Calculable trapezo = shapeFactoryImpl.getShape(ShapeType.Trapezium, new Double[]{5.0 , 4.0 , 5.0});
        System.out.println("Trapezo area: "+ trapezo.calculateArea());

        Calculable Hexagon = shapeFactoryImpl.getShape(ShapeType.Hexagon, new Double[]{6.0});
        System.out.printf("Hexagon area: %.2f%n", Hexagon.calculateArea());

        Calculable Diamond = shapeFactoryImpl.getShape(ShapeType.Diamond, new Double[]{5.0 , 4.0});
        System.out.println("Diamond area: "+ Diamond.calculateArea());








    }
}










