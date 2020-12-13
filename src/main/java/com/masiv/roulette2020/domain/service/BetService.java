package com.masiv.roulette2020.domain.service;

import com.masiv.roulette2020.domain.Bet;
import com.masiv.roulette2020.domain.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BetService {
    @Autowired
    private BetRepository betRepository;
    public List<Bet> getAllBets(){return betRepository.getAllBets();}
    public Bet createBet(Bet bet){return betRepository.createBet(bet);}//BUG
    public List<Bet> findByIdRoulette(int idRoulette){
        List<Bet> betList = betRepository.findByIdRoulette(idRoulette);
        int numberWinner = numberWinner();
        String colorWinner = (numberWinner%2==0)?"rojo":"negro";
        betList = winnerList(betList,numberWinner,colorWinner);
        return betList;
    }
    private int numberWinner(){
        int numberWinner = (int) Math.random()*(36-0+1)+0;
        System.err.println(numberWinner);
        return numberWinner;
    }
    private List<Bet> winnerList(List<Bet> betList,int numberWinner, String colorWinner){
        int aux = 0;
        for (Bet bet:betList) {
            if(bet.getBetNumber() == null && bet.getBetColor() == colorWinner){
                bet.setCoins(bet.getCoins()*1.8);
                betList.set(aux,bet);
            }
            else if(bet.getBetNumber() == numberWinner && bet.getBetColor() == null){
                bet.setCoins(bet.getCoins()*5);
                betList.set(aux,bet);
            }
            else{
                bet.setCoins(bet.getCoins()*0);
                betList.set(aux,bet);
            }
            aux++;

        }
        return betList;
    }
}
