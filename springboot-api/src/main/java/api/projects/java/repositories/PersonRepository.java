package api.projects.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.projects.java.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}
