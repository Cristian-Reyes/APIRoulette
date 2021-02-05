package com.masiv.roulette2020.persistence.mapper;

import com.masiv.roulette2020.domain.Bet;
import com.masiv.roulette2020.persistence.entity.EntityBet;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;


@Mapper(componentModel = "spring", uses = {RouletteMapper.class})
public interface BetMapper {
    @Mappings({
            @Mapping(source = "idBet", target = "betId"),
            @Mapping(source = "idUser", target = "userId"),
            @Mapping(source = "betNumber", target = "betNumber"),
            @Mapping(source = "betColor", target = "betColor"),
            @Mapping(source = "coins", target = "coins"),
            @Mapping(source = "entityRoulette", target = "roulette"),
    })
    Bet toBet(EntityBet entityBet);
    List<Bet> toBets(List<EntityBet> entityBetList);

    @InheritInverseConfiguration
    EntityBet toEntityBet(Bet bet);
}
