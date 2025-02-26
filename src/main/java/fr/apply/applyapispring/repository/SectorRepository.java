package fr.apply.applyapispring.repository;

import fr.apply.applyapispring.model.entity.sector.Sector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorRepository extends CrudRepository<Sector, Integer> {
}
