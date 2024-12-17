package org.ies.airline.components;

import org.ies.airline.model.Airline;
import org.ies.airline.model.Flight;

import java.util.Scanner;

public class AirlineReader {

    private final Scanner scanner;
    private final FlightReader flightReader;

    public AirlineReader(Scanner scanner, FlightReader flightReader) {
        this.scanner = scanner;
        this.flightReader = flightReader;
    }

    public Airline read(){
        System.out.println("Nombre de la aerolínea");
        String name = scanner.nextLine();

        System.out.println("¿Cuantos vuelos hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Flight[] flights = new Flight[size];
        for (int i = 0; i < size; i++) {
            flights[i] = flightReader.read();
        }

        return new Airline(
                name,
                flights
        );
    }
}
