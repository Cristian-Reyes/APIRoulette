package com.masiv.roulette2020.persistence;

import com.masiv.roulette2020.domain.Bet;
import com.masiv.roulette2020.domain.repository.BetRepository;
import com.masiv.roulette2020.persistence.crud.BetCrudRepository;
import com.masiv.roulette2020.persistence.entity.EntityBet;
import com.masiv.roulette2020.persistence.mapper.BetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BetRepositoryPersistence implements BetRepository {
    @Autowired
    private BetCrudRepository betCrudRepository;
    @Autowired
    private BetMapper mapper;


    @Override
    public List<Bet> findByIdRoulette(int idRoulette) {
        return mapper.toBets(betCrudRepository.findByidRoulette(idRoulette));
    }
}
