package fr.william.croisiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.william.croisiere.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
