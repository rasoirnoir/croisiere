package fr.william.croisiere.model;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private double montant;
    
    @Temporal(value = TemporalType.DATE)
    private Calendar dateResa;
    
    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name="CROISIERE_ID")
    private Croisiere croisiere;
    
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(double montant, Calendar dateResa, Croisiere croisiere) {
		super();
		this.montant = montant;
		this.dateResa = dateResa;
		this.croisiere = croisiere;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Calendar getDateResa() {
		return dateResa;
	}
	public void setDateResa(Calendar dateResa) {
		this.dateResa = dateResa;
	}
	public Croisiere getCroisiere() {
		return croisiere;
	}
	public void setCroisiere(Croisiere croisiere) {
		this.croisiere = croisiere;
	}
	@Override
	public int hashCode() {
		return Objects.hash(croisiere, dateResa, id, montant);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(croisiere, other.croisiere) && Objects.equals(dateResa, other.dateResa) && id == other.id
				&& Double.doubleToLongBits(montant) == Double.doubleToLongBits(other.montant);
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", montant=" + montant + ", dateResa=" + dateResa + ", croisiere=" + croisiere
				+ "]";
	}
    
    
}
