package fr.william.croisiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.william.croisiere.model.Croisiere;

@Repository
public interface CroisiereRepository extends JpaRepository<Croisiere, Integer> {

}

//@Repository
//public interface CroisiereRepository extends CrudRepository<Croisiere, Integer> {
//
//}