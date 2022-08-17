package FlightControl.domain;

public class Flight {

    private Airplane airplane;
    private Airport departureAirport;
    private Airport targetAirport;

    public Flight(Airplane airplane, Airport departureAirport, Airport targetAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport gettargetAirport() {
        return targetAirport;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}
