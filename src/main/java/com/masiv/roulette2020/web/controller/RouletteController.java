package com.masiv.roulette2020.web.controller;

import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.domain.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roulette")
public class RouletteController {
    @Autowired
    private RouletteService rouletteService;

    @GetMapping("/allRoulette")
    public List<Roulette> getAllRoulette(){
        return rouletteService.getAllRoulette();
    }

    @PostMapping("/createRoulette")
    public int createRoulette(@RequestBody Roulette roulette){
        return rouletteService.createRoulette(roulette).getRouletteId();
    }
}
