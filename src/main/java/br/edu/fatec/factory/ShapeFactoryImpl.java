package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {
    Calculable result = null;

    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        switch (type) {
            case Square:
                return new Square(values[0]);

            case Rectangle:
                return new Rectangle(values[0], values[1]);

            case Circle:
                return new Circle(values[0], values[1]);

            case Triangle:
                return new Triangle(values[0], values[1]);
        }
        return result;
    }
}

