package com.masiv.roulette2020.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "bet")
public class EntityBet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bet")
    private Integer idBet;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "bet_number")
    private Integer betNumber;
    @Column(name = "bet_color")
    private String betColor;
    @ManyToOne
    @JoinColumn(name = "id_roulette", insertable = false,updatable = false)
    private EntityRoulette entityRoulette;

    // Getters & Setters
    public Integer getIdBet() {
        return idBet;
    }

    public void setIdBet(Integer idBet) {
        this.idBet = idBet;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

    public EntityRoulette getEntityRoulette() {
        return entityRoulette;
    }

    public void setEntityRoulette(EntityRoulette entityRoulette) {
        this.entityRoulette = entityRoulette;
    }
}
