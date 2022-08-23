package com.mycompany.crm.services;

import com.mycompany.crm.entities.County;
import com.mycompany.crm.repositories.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class CountyService {

    @Autowired
    private CountyRepository countyRepository;

    public Iterable<County> getCounties(){
        return countyRepository.findAll();
    }
    public Optional<County> getCounty(final Integer id) {
        return countyRepository.findById(id);
    }
}
