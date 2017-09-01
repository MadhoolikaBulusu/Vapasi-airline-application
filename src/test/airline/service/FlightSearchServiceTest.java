package airline.service;

import airline.model.Flight;
import airline.model.FlightSearch;
import airline.repository.FlightRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest(value = FlightSearchService.class)
public class FlightSearchServiceTest {


    @MockBean
    private FlightRepository flightRepository;

    @Autowired
    private FlightSearchService flightSearchService;

    Flight mockFlight = new Flight("src", "dest", "123");
    private List<Flight> listOfMockFlights = new ArrayList<>(Arrays.asList(mockFlight));

    @Test
    public void testGetFlightsBetweenCities() {
        Mockito.when(flightRepository.getFlights()).thenReturn(listOfMockFlights);

        FlightSearch search = new FlightSearch();
        search.setToLocation("dest");
        search.setFromLocation("src");
        List<Flight> listOfFlights = flightSearchService.searchFlights(search);

        assertEquals(listOfFlights, listOfMockFlights);
    }

}