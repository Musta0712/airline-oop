package org.ies.airline.model;

import java.util.Arrays;
import java.util.Objects;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private int gateNumber;
    private Passenger[] passengers;

    public Flight(int flightNumber, String origin, String destination, int gateNumber, Passenger[] passengers) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.gateNumber = gateNumber;
        this.passengers = passengers;
    }

    public void showInfo() {
        System.out.println("Número de vuelo: " + flightNumber + "Origen: " + origin + "Destino: " + destination + "Puerta de embarque: " + gateNumber + "Número de pasajeros: ");
        for (var passenger : passengers) {
            passenger.showInfo();
        }
    }

    public boolean hasPassenger(String nif) {
        for (var passenger : passengers) {
            if (passenger.getNif().equals(nif)) {
                return true;
            }
        }
        return false;
    }

    public Passenger findPassenger(String nif) {
        for (var passenger : passengers) {
            if (passenger.getNif().equals(nif)){
                return passenger;
            }
        }
        return null;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightNumber == flight.flightNumber && gateNumber == flight.gateNumber && Objects.equals(origin, flight.origin) && Objects.equals(destination, flight.destination) && Objects.deepEquals(passengers, flight.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, origin, destination, gateNumber, Arrays.hashCode(passengers));
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber=" + flightNumber +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", gateNumber=" + gateNumber +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
