package fr.apply.applyapispring.repository;

import fr.apply.applyapispring.model.entity.application.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Integer> {
}
