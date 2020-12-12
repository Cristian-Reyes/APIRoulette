package com.masiv.roulette2020.domain.repository;

import com.masiv.roulette2020.domain.Roulette;
import java.util.List;
import java.util.Optional;

public interface RouletteRepository {
    List<Roulette> getAllRoulettes();
    Roulette createRoulette(Roulette roulette);
    Optional<Roulette> openRoulette(int rouletteId);
}
