package com.mycompany.crm.controllers;

import com.mycompany.crm.entities.Brand;
import com.mycompany.crm.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/brands")
    public Iterable<Brand> getBrands(){
        return brandService.getBrands();
    }

    @GetMapping("/brands/{id}")
    public Optional<Brand> getBrand(@PathVariable("id") final Integer id) {
        return brandService.getBrand(id);
    }


}
