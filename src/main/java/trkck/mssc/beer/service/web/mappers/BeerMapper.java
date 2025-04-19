package trkck.mssc.beer.service.web.mappers;

import org.mapstruct.Mapper;
import trkck.mssc.beer.service.domain.Beer;
import trkck.mssc.beer.service.web.model.BeerDto;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);

}
