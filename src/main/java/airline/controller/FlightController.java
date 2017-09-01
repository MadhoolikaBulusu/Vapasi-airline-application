package airline.controller;

import airline.model.Flight;
import airline.model.FlightSearch;
import airline.service.FlightSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class FlightController {

    @Autowired
    FlightSearchService flightSearchService;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String welcomeMessage(Model model) {
        model.addAttribute("flightSearch", new FlightSearch());
        return "flightSearch";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String listFlights(@ModelAttribute FlightSearch search, Model model) {
        List<Flight> searchedFlights = flightSearchService.searchFlights(search);
        model.addAttribute("flightSearchValues", search);
        model.addAttribute("flights", searchedFlights);
        return "flightSearch";
    }
}
