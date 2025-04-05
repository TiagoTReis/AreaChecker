package br.edu.fatec.factory;

public class Parallelogram implements Calculable{

    private double base;
    private double altura;

    public Parallelogram(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        return base*altura;
    }
}
