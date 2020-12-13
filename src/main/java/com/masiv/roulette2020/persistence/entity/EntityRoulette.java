package com.masiv.roulette2020.persistence.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roulette")
public class EntityRoulette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roulette")
    private Integer idRoulette;
    private Boolean active;
    @OneToMany(mappedBy = "entityRoulette")
    private List<EntityRoulette> entityRoulette;

    // Getters & Setters
    public Integer getIdRoulette() {
        return idRoulette;
    }

    public void setIdRoulette(Integer idRoulette) {
        this.idRoulette = idRoulette;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<EntityRoulette> getEntityRoulette() {
        return entityRoulette;
    }

    public void setEntityRoulette(List<EntityRoulette> entityRoulette) {
        this.entityRoulette = entityRoulette;
    }
}
