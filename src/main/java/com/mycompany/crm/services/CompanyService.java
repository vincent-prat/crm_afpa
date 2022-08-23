package com.mycompany.crm.services;

import com.mycompany.crm.entities.Company;
import com.mycompany.crm.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Iterable<Company> getCompanies() {
        return companyRepository.findAll();
    }
    public Optional<Company> getCompany(Integer id) {
        return companyRepository.findById(id);
    }

}
