package br.com.thiagoodev.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        final Director director = new Director();

        final CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        final Car car = builder.getCar();

        final CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportCar(carManualBuilder);
        final Manual manual = carManualBuilder.getManual();

        System.out.println(car);
        System.out.println(manual);
    }
}
