package com.masiv.roulette2020.domain;


public class Bet {
    private Integer betId;
    private Integer userId;
    private Integer betNumber;
    private String betColor;
    private Double coins;
    private Roulette roulette;

    //Getters & Setters
    public Integer getBetId() {
        return betId;
    }

    public void setBetId(Integer betId) {
        this.betId = betId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBetNumber() {
        return betNumber;
    }
    public void setBetNumber(Integer betNumber) {
        this.betNumber = betNumber;
    }

    public String getBetColor() {
        return betColor;
    }

    public void setBetColor(String betColor) {
        this.betColor = betColor;
    }

    public Roulette getRoulette() {
        return roulette;
    }

    public void setRoulette(Roulette roulette) {
        this.roulette = roulette;
    }

    public Double getCoins() {
        return coins;
    }

    public void setCoins(Double coins) {
        this.coins = coins;
    }
}
