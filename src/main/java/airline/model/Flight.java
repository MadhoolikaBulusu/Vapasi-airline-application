package airline.model;

public class Flight {
    private String fromLocation;
    private String toLocation;
    private String flightNumber;
    private int capacity;

    public Flight(String fromLocation, String toLocation, String flightNumber, int capacity) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.flightNumber = flightNumber;
        this.capacity = capacity;
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

    public boolean isSeatAvailable(int noOfSeats) {
        return capacity >= noOfSeats;
    }
}
