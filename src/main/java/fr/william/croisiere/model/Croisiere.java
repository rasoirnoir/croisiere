package fr.william.croisiere.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Croisiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private int duree;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="¨PAQUEBOT_ID")
	private Paquebot paquebot;
	public Croisiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Croisiere(String nom, int duree) {
		super();
		this.nom = nom;
		this.duree = duree;
	}
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
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Paquebot getPaquebot() {
		return paquebot;
	}
	public void setPaquebot(Paquebot paquebot) {
		this.paquebot = paquebot;
	}
	@Override
	public int hashCode() {
		return Objects.hash(duree, id, nom, paquebot);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Croisiere other = (Croisiere) obj;
		return duree == other.duree && id == other.id && Objects.equals(nom, other.nom)
				&& Objects.equals(paquebot, other.paquebot);
	}
	@Override
	public String toString() {
		return "Croisiere [id=" + id + ", nom=" + nom + ", duree=" + duree + ", paquebot=" + paquebot + "]";
	}
	 
	 
}
