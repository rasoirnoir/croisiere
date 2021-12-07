package fr.william.croisiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.william.croisiere.model.Paquebot;

@Repository
public interface PaquebotRepository extends JpaRepository<Paquebot, Integer> {

}
