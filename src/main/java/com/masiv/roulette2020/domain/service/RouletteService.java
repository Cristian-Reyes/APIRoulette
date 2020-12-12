package com.masiv.roulette2020.domain.service;

import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.domain.repository.RouletteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RouletteService {
    @Autowired
    private RouletteRepository rouletteRepository;

    public List<Roulette> getAllRoulette(){
        return rouletteRepository.getAllRoulettes();
    }


}
