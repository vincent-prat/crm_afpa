package com.mycompany.crm.controllers;

import com.mycompany.crm.entities.County;
import com.mycompany.crm.services.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CountyController {

    @Autowired
    private CountyService countyService;

    @GetMapping("/counties")
    public Iterable<County> getCounties() {
        return countyService.getCounties();
    }

    @GetMapping("/counties/{id}")
    public Optional<County> getCounty(@PathVariable("id") final Integer id) {
        return countyService.getCounty(id);
    }
}
