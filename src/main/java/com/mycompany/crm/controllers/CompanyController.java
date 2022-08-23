package com.mycompany.crm.controllers;

import com.mycompany.crm.entities.Company;
import com.mycompany.crm.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public Iterable<Company> getCompanies() {
        return companyService.getCompanies();
    }

    @GetMapping("/companies/{id}")
    public Optional<Company> getCompanyById(@PathVariable Integer id) {
        return companyService.getCompany(id);
    }
}
