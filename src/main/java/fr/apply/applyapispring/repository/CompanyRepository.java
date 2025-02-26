package fr.apply.applyapispring.repository;

import fr.apply.applyapispring.model.entity.company.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository <Company, Integer> {
}
