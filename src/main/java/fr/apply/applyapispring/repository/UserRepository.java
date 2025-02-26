package fr.apply.applyapispring.repository;

import fr.apply.applyapispring.model.entity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
