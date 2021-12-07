package fr.william.croisiere.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paquebot {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String nom;
    private double tonnage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getTonnage() {
		return tonnage;
	}
	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}
	public Paquebot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paquebot(String nom, double tonnage) {
		super();
		this.nom = nom;
		this.tonnage = tonnage;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nom, tonnage);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquebot other = (Paquebot) obj;
		return id == other.id && Objects.equals(nom, other.nom)
				&& Double.doubleToLongBits(tonnage) == Double.doubleToLongBits(other.tonnage);
	}
	@Override
	public String toString() {
		return "Paquebot [id=" + id + ", nom=" + nom + ", tonnage=" + tonnage + "]";
	}
    
    
}
