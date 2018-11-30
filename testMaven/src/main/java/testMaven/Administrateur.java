package testMaven;

import java.util.List;

public class Administrateur extends Employe{
	
	
	public Administrateur(Agence a,Entreprise e) {
		super(a, e);
	
		
	}
	
	public boolean attribuerMateriel(Empruntable empruntable, Emprunteur emprunteur) {
		return emprunteur.stock.add(empruntable);
	}
	
	public boolean recupererMateriel (Empruntable empruntable, Emprunteur emprunteur) {
		return emprunteur.stock.remove(empruntable);
	}
	
	public List<Empruntable> stockEntreprise(){
		return getEntreprise().listeMateriel();
		
	}
	
	public List<Empruntable> stockAgence(){
		// A REVOIR
		return getAgence().listeMateriel();
		
	}
	
	public void transfererMateriel(Emprunteur emprunteur1,Empruntable empruntable,Emprunteur emprunteur2) {

		emprunteur1.listeMateriel().remove(empruntable);
		emprunteur2.listeMateriel().add(empruntable);
	}
	
	public void supprimerMateriel(Empruntable e) {
		getEntreprise().listeMateriel().remove(e);
	}
	
	public void supprimerMaterielDefectueuxEntreprise() {
		for(Empruntable e: getEntreprise().listeMateriel() ) {
			if(e.defectueux) {
				getEntreprise().listeMateriel().remove(e);
			}
		}
		
	}
	
	public void supprimerMaterielDefectueuxAgence(Agence a) {
		for(Empruntable e: a.listeMateriel() ) {
			if(e.defectueux) {
				a.listeMateriel().remove(e);
			}
		}
	}
	
	public void supprimerMaterielDefectueuxAgence() {
		for(Empruntable e: this.getAgence().listeMateriel() ) {
			if(e.defectueux) {
				this.getAgence().listeMateriel().remove(e);
			}
		}
	}
	
	public void supprimerMaterielDefectueuxDe(Emprunteur e) {
		for(Empruntable emp: e.listeMateriel() ) {
			if(emp.defectueux) {
				e.listeMateriel().remove(e);
			}
		}
	}
	
	
	// Etape 9
	public void ajoutMateriel(Empruntable e) {
		getEntreprise().listeMateriel().add(e);
		
	}
	
}
