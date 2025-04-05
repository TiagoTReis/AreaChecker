package br.edu.fatec.factory;

public class Square implements Calculable{

    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return lado *lado;
    }

}
