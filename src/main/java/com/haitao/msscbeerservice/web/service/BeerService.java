package com.haitao.msscbeerservice.web.service;

import com.haitao.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID bearId, BeerDto beerDto);

}
