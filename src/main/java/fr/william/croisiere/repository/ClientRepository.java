package fr.william.croisiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.william.croisiere.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
