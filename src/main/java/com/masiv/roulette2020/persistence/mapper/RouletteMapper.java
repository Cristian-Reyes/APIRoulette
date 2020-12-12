package com.masiv.roulette2020.persistence.mapper;

import com.masiv.roulette2020.domain.Roulette;
import com.masiv.roulette2020.persistence.entity.EntityRoulette;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RouletteMapper {
    @Mappings({
            @Mapping(source = "idRoulette",target = "rouletteId"),
            @Mapping(source = "active",target = "active"),
    })
    Roulette toRoulette(EntityRoulette entityRoulette);
    List<Roulette> toRoulettes(List<EntityRoulette> entityRouletteList);

    @InheritInverseConfiguration
    EntityRoulette toEntityRoulette(Roulette roulette);
}
