package br.com.thiagoodev.designpatterns.strategy;

public class Context {
    private Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    double executeStrategy(double a, double b) {
        return strategy.execute(a, b);
    }
}
