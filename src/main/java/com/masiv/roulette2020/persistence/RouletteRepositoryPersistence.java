package com.masiv.roulette2020.persistence;

import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.domain.repository.RouletteRepository;
import com.masiv.roulette2020.persistence.crud.RouletteCrudRepository;
import com.masiv.roulette2020.persistence.entity.EntityRoulette;
import com.masiv.roulette2020.persistence.mapper.RouletteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RouletteRepositoryPersistence implements RouletteRepository {
    @Autowired
    private RouletteCrudRepository rouletteCrudRepository;
    @Autowired
    private RouletteMapper mapper;
    @Override
    public List<Roulette> getAllRoulettes(){
        List<EntityRoulette> entityRoulettes = (List<EntityRoulette>) rouletteCrudRepository.findAll();
        return mapper.toRoulettes(entityRoulettes);
    }

    @Override
    public Roulette createRoulette(Roulette roulette) {
        EntityRoulette entityRoulette = mapper.toEntityRoulette(roulette);

        return mapper.toRoulette(rouletteCrudRepository.save(entityRoulette));
    }

}
