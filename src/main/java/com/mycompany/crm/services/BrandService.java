package com.mycompany.crm.services;

import com.mycompany.crm.entities.Brand;
import com.mycompany.crm.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Iterable<Brand> getBrands(){
        return brandRepository.findAll();
    }
    public Optional<Brand> getBrand(final Integer id) {
        return brandRepository.findById(id);
    }
}
