package com.example.lesson24.controllers;

import com.example.lesson24.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country country = Country.of("France", 80);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .body(country);
    }

    @GetMapping("/all")
    public List<Country> countries(){
        Country country1 = Country.of("France", 80);
        Country country2 = Country.of("Spain", 50);
        return List.of(country1, country2);
    }

}
