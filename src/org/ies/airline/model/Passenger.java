package org.ies.airline.model;

import java.util.Objects;

public class Passenger {
    private String nif;
    private String name;
    private String surname;
    private Integer seatNumber;

    public Passenger(String nif, String name, String surname, Integer seatNumber) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.seatNumber = seatNumber;
    }

    public void showInfo() {
        System.out.println("NIF: " + nif + "Nombre: " + name + "Apellido: " + surname + "ID: " + seatNumber);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(nif, passenger.nif) && Objects.equals(name, passenger.name) && Objects.equals(surname, passenger.surname) && Objects.equals(seatNumber, passenger.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, seatNumber);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
