package br.edu.fatec.factory;

public class Rectangle implements Calculable{
    private double base;
    private double altura;

    public Rectangle(double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        return base * altura;
    }
}
