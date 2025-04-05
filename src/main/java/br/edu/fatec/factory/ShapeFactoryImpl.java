package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {
    Calculable result = null;

    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        switch (type) {
            case Square:
                return new Square(values[0]);
        }
        return result;
    }
}

