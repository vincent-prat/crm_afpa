package com.mycompany.crm.repositories;

import com.mycompany.crm.entities.County;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountyRepository extends CrudRepository<County, Integer> {

}