package br.edu.fatec;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl shapeFactoryImpl = new ShapeFactoryImpl();

        Calculable square = shapeFactoryImpl.getShape(ShapeType.Square, new Double[]{4.0});
        System.out.println("Square area: "+square.calculateArea());




    }
}










