package com.masiv.roulette2020.domain.repository;

import com.masiv.roulette2020.domain.Bet;
import java.util.List;

public interface BetRepository {
    List<Bet> getAllBets();
    Bet createBet(Bet bet);
    List<Bet> findByIdRoulette(int idRoulette);
}
