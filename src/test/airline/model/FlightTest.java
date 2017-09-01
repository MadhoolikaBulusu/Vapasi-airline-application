package airline.model;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlightTest {

    @Test
    public void shouldReturnTrueIfSourceAndDestinationMatches(){
        Flight flight = new Flight("src", "dest", "123");
        assertTrue(flight.isFlightBetweenCities("src", "dest"));
    }

    @Test
    public void shouldReturnFalseIfSourceAndDestinationDoNotMatch(){
        Flight flight = new Flight("src", "dest", "123");
        assertTrue(flight.isFlightBetweenCities("someOtherSrc", "SomeOtherDest"));
    }

}