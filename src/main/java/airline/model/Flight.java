package airline.model;


public class Flight {
    String fromLocation;
    String toLocation;
    String flightNumber;

    public Flight(String fromLocation, String toLocation, String flightNumber) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.flightNumber = flightNumber;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public boolean isFlightBetweenCities(String source, String Destination) {
        return (fromLocation.equals(source) && toLocation.equals(Destination));
    }
}
