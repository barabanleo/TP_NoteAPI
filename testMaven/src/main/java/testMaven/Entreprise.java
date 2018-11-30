package testMaven;

import java.util.ArrayList;
import java.util.List;

public class Entreprise extends Emprunteur {

	List<Agence> agences=new ArrayList<Agence>();
	List<Employe> employes=new ArrayList<Employe>();
	String nomEntreprise;
	
	Entreprise(String n){
		this.nomEntreprise=n;
	}

	public List<Agence> getAgences() {
		return agences;
	}

	public void setAgences(List<Agence> agences) {
		this.agences = agences;
	}
	
	
}
