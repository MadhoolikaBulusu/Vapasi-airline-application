package airline.service;

import airline.model.Flight;
import airline.model.FlightSearch;
import airline.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class FlightSearchService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> searchFlights(FlightSearch search) {
        List<Flight> listOfAllFlights = flightRepository.getFlights();
        return listOfAllFlights.stream()
                .filter(flight -> flight.isFlightBetweenCities(search.getFromLocation(), search.getToLocation()))
                .collect(Collectors.toList());

    }
}
