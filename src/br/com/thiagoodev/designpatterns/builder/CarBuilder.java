package br.com.thiagoodev.designpatterns.builder;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    Car getCar() { return this.car; }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats() {

    }

    @Override
    public void setEngine() {

    }

    @Override
    public void setTripComputer() {

    }

    @Override
    public void setGPS() {

    }
}
