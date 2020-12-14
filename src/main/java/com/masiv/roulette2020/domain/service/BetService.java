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

    public List<Bet> findByIdRoulette(int idRoulette){
        List<Bet> betList = betRepository.findByIdRoulette(idRoulette);
        int numberWinner = numberWinner();
        String colorWinner = (numberWinner%2==0)?"rojo":"negro";
        betList = winnerList(betList,numberWinner,colorWinner);
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
            else if(bet.getBetNumber() == numberWinner){
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
