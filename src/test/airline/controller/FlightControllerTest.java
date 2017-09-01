package airline.controller;


import airline.model.Flight;
import airline.service.FlightSearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(value = FlightController.class)
public class FlightControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FlightSearchService flightSearchService;

    Flight MockFlight = new Flight("source", "destination", "FR123");
    List<Flight> mockList = new ArrayList<>(Arrays.asList(MockFlight));

    @Test
    public void getSearchFlights() throws Exception {
        Mockito.when(flightSearchService.searchFlights(Mockito.anyObject()))
                .thenReturn(mockList);
        mockMvc.perform(MockMvcRequestBuilders.get("/search").accept(MediaType.TEXT_HTML))
                .andExpect(view().name("flightSearch"));

    }

}