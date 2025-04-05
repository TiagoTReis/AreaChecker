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




    }
}










