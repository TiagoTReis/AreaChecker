package br.edu.fatec.factory;

public class Hexagon implements Calculable{

    private double lado;

    public Hexagon(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);

    }
}
