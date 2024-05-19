package com.msbrewery.msbeerservice.mapper;

import com.msbrewery.msbeerservice.domain.Beer;
import com.msbrewery.msbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDto beerDto);
    BeerDto beerToBeerDto(Beer beer);
}
