package br.com.thiagoodev.designpatterns.builder;

public class Director {
    void constructSportCar(Builder builder) {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }

    void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }
}
