package trkck.mssc.beer.service.web.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trkck.mssc.beer.service.web.model.BeerDto;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID beerId){

        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //to do implement
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){

        //to do Impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
