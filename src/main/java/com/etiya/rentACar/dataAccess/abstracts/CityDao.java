package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {

}
