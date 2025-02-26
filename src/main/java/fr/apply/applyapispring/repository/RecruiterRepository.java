package fr.apply.applyapispring.repository;

import fr.apply.applyapispring.model.entity.recruiter.Recruiter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends CrudRepository<Recruiter, Integer> {
}
