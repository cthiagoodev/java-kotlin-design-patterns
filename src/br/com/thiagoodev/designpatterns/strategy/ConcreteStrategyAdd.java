package br.com.thiagoodev.designpatterns.strategy;

public class ConcreteStrategyAdd implements Strategy{
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
