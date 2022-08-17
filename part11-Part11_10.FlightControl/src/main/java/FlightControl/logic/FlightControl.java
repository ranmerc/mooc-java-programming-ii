package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;

import FlightControl.domain.Airplane;
import FlightControl.domain.Airport;
import FlightControl.domain.Flight;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Airport> airports;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        airplanes = new HashMap<>();
        airports = new HashMap<>();
        flights = new HashMap<>();
    }

    public void addAirplane(String id, int capacity) {
        airplanes.put(id, new Airplane(id, capacity));
    }

    public void addFlight(Airplane airplane, String departureID, String destinationID) {
        airports.putIfAbsent(departureID, new Airport(departureID));
        airports.putIfAbsent(destinationID, new Airport(destinationID));

        Flight flight = new Flight(airplane, airports.get(departureID), airports.get(destinationID));
        flights.put(flight.toString(), flight);
    }

    public Collection<Flight> getFlights() {
        return flights.values();
    }

    public Airplane getAirplane(String id) {
        return airplanes.get(id);
    }

    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
    }
}
