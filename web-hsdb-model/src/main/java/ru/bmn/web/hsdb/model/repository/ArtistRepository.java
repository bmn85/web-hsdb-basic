package ru.bmn.web.hsdb.model.repository;

import org.springframework.data.repository.CrudRepository;
import ru.bmn.web.hsdb.model.entity.hs.Artist;


public interface ArtistRepository extends CrudRepository<Artist, Integer> {
}
