package br.com.thiagoodev.designpatterns.builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    Manual getManual() { return this.manual; }

    @Override
    public void reset() {
        this.manual = new Manual();
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
