package com.masiv.roulette2020.domain.service;

import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.domain.repository.RouletteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RouletteService {
    @Autowired
    private RouletteRepository rouletteRepository;
    public List<Roulette> getAllRoulette(){
        return rouletteRepository.getAllRoulettes();
    }
    public Roulette createRoulette(Roulette roulette){
        return rouletteRepository.createRoulette(roulette);
    }
    public Optional<Roulette> openRoulette(int rouletteId){
        return rouletteRepository.openRoulette(rouletteId);
    }
}
