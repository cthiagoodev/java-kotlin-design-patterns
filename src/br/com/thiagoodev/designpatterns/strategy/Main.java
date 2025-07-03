package br.com.thiagoodev.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        final Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        double result = context.executeStrategy(10, 14);

        System.out.println(result);

        context.setStrategy(new ConcreteStrategySubtract());
        result = context.executeStrategy(23, 5);

        System.out.println(result);

        context.setStrategy(new ConcreteStrategyMultiply());
        result = context.executeStrategy(30, 150);

        System.out.println(result);
    }
}
