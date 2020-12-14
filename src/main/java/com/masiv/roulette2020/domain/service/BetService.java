package com.masiv.roulette2020.domain.service;

import com.masiv.roulette2020.domain.Bet;
import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.domain.repository.BetRepository;
import com.masiv.roulette2020.domain.repository.RouletteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BetService {
    @Autowired
    private BetRepository betRepository;
    @Autowired
    private RouletteRepository rouletteRepository;

    public List<Bet> findByIdRoulette(int idRoulette){
        Optional<Roulette> roulette = rouletteRepository.findRoulette(idRoulette);
        if(!roulette.get().isActive()){return null;}
        List<Bet> betList = betRepository.findByIdRoulette(idRoulette);
        if (betList.isEmpty()){return null;}
        int numberWinner = numberWinner();
        String colorWinner = (numberWinner%2==0)?"rojo":"negro";
        betList = winnerList(betList,numberWinner,colorWinner);
        betRepository.deletedByIdRoulette(idRoulette);
        return betList;
    }
    private int numberWinner(){
        int numberWinner = (int) Math.random()*36;
        System.err.println(numberWinner);
        return numberWinner;
    }
    private List<Bet> winnerList(List<Bet> betList,int numberWinner, String colorWinner){
        int aux = 0;
        for (Bet bet:betList) {
            if(bet.getBetColor().equals(colorWinner)){
                bet.setCoins(bet.getCoins()*1.8);
                betList.set(aux,bet);
                System.out.println("color");
            }
            else if(bet.getBetNumber().equals(numberWinner)){
                bet.setCoins(bet.getCoins()*5);
                betList.set(aux,bet);
                System.out.println("numero");
            }
            else{
                bet.setCoins(bet.getCoins()*0);
                betList.set(aux,bet);
                System.out.println("ninguno");
            }
            System.out.println(aux);
            aux++;
        }
        return betList;
    }
}
