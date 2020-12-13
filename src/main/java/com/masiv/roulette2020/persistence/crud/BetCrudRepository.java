package com.masiv.roulette2020.persistence.crud;

import com.masiv.roulette2020.persistence.entity.EntityBet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BetCrudRepository extends CrudRepository<EntityBet,Integer> {

    @Query(value = "SELECT * FROM bet WHERE id_roulette = ?1",nativeQuery = true)
    List<EntityBet> findByidRoulette(int idRoulette);
}
