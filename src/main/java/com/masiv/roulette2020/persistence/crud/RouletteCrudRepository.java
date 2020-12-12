package com.masiv.roulette2020.persistence.crud;

import com.masiv.roulette2020.persistence.entity.EntityRoulette;
import org.springframework.data.repository.CrudRepository;

public interface RouletteCrudRepository extends CrudRepository<EntityRoulette,Integer> {

}
