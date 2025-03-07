package trkck.mssc.beer.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import trkck.mssc.beer.service.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer,UUID> {
}
