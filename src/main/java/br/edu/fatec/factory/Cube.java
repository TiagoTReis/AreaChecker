package br.edu.fatec.factory;

public class Cube implements Calculable{

    private double lado;

    public Cube(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(lado, 2);
    }
}
