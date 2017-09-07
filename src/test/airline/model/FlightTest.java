package airline.model;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    private Flight flight;

    @Before
    public void setUp(){
        flight = new Flight("src", "dest", "123", 22);
    }

    @Test
    public void shouldReturnTrueIfSourceAndDestinationMatches(){
        assertTrue(flight.isFlightBetweenCities("src", "dest"));
    }

    @Test
    public void shouldReturnFalseIfSourceAndDestinationDoNotMatch(){
        assertFalse(flight.isFlightBetweenCities("someOtherSrc", "SomeOtherDest"));
    }

    @Test
    public void shouldReturnTrueIfNoOfSeatsIslessThanCapacity() {
        assertTrue(flight.isSeatAvailable(10));
    }

    @Test
    public void shouldReturnFalseIfNoOfSeatsIsGreaterThanCapacity() {
        assertFalse(flight.isSeatAvailable(25));
    }

}