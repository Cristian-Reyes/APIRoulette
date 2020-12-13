package com.masiv.roulette2020.web.controller;


import com.masiv.roulette2020.domain.Bet;
import com.masiv.roulette2020.domain.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bet")
public class BetController {
    @Autowired
    private BetService betService;
    @GetMapping("/allBets")
    public List<Bet> getAllBets(){
        return betService.getAllBets();
    }
    @PostMapping("/createBet")
    public String createBet(@RequestBody Bet bet){
        Bet reciveBet = betService.createBet(bet);
        if(reciveBet != null){return "Apuesta Exitosa";}
        else return "Apuesta Fallida";
    }
    @GetMapping("/closeBet/{id}")
    public List<Bet> closeBet(@PathVariable("id") int idRoulette){
        return betService.findByIdRoulette(idRoulette);
    }
}
