package com.masiv.roulette2020.web.controller;

import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.domain.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
