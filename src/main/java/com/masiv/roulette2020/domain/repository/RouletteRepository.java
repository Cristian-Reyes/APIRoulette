package com.masiv.roulette2020.domain.repository;

import com.masiv.roulette2020.domain.Roulette;
import java.util.List;

public interface RouletteRepository {
    List<Roulette> getAllRoulettes();
    Roulette createRoulette(Roulette roulette);
}
