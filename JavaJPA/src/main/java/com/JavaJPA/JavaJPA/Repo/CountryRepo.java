package com.JavaJPA.JavaJPA.Repo;

import com.JavaJPA.JavaJPA.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {
}
