package br.com.thiagoodev.designpatterns.builder;

public interface Builder {
    void reset();
    void setSeats();
    void setEngine();
    void setTripComputer();
    void setGPS();
}
