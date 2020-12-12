package com.masiv.roulette2020.web.controller;

import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.domain.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roulette")
public class RouletteController {
    @Autowired
    private RouletteService rouletteService;
    @GetMapping("/allRoulette")
    public ResponseEntity<List<Roulette>> getAllRoulette(){
        return new ResponseEntity<>(rouletteService.getAllRoulette(), HttpStatus.OK);
    }
    @PostMapping("/createRoulette")
    public ResponseEntity<Integer> createRoulette(@RequestBody Roulette roulette){
        return new ResponseEntity<>(rouletteService.createRoulette(roulette).getRouletteId(),HttpStatus.CREATED);
    }
    @GetMapping("/openRoulette/{id}")
    public Boolean openRoulette(@PathVariable("id") int rouletteId){
        Optional<Roulette> roulette = rouletteService.openRoulette(rouletteId);
        if (roulette.isPresent() && roulette.get().isActive() == true){
            return roulette.get().isActive();
        }else {
            Roulette roulette1 = new Roulette();
            roulette1.setActive(true);
            roulette1.setRouletteId(rouletteId);
            rouletteService.createRoulette(roulette1);
            return openRoulette(rouletteId);
        }
    }
}
