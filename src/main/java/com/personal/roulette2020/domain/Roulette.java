package com.masiv.roulette2020.domain;

public class Roulette {
    private int rouletteId;
    private boolean active;

    //Getters & Setters

    public int getRouletteId() {
        return rouletteId;
    }

    public void setRouletteId(int rouletteId) {
        this.rouletteId = rouletteId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
