package com.masiv.roulette2020.persistence.crud;


import com.masiv.roulette2020.persistence.entity.EntityRoulette;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RouletteCrudRepository extends  CrudRepository<EntityRoulette,Integer> {
}
