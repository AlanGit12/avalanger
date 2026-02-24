package ch.zhaw.avalanger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.avalanger.model.Averlange;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/avalange")
public class AvalangeController {

        @GetMapping({"", "/{country}"})
        public String getAllAvalange(@PathVariable(required = false) String country, 
        @RequestParam(required = false) String state) {
            if (country == null || country.isEmpty()) {
                return "Getting all avalange for all countries";
            }
            return "Getting all avalange for country: " + country + " with state: " + state;
        }



        @PostMapping("")
        public String postMethodName(@RequestBody Averlange avalange) {
            return "Creating new avalange for country: " + avalange.getCountry() + " with state: " + avalange.getState() + " and description: " + avalange.getDescription();
        }
    }

    




