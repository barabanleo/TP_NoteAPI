package testMaven;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Emprunteur {
	List<Employe> employes=new ArrayList<Employe>();
	private String nom;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	Agence(String nom){
		this.nom=nom;
		
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
}
