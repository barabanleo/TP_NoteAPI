package testMaven;

import java.util.Comparator;

public class ComparateurAgence implements  Comparator<Agence>  {

	public int compare(Agence a1, Agence a2) {
		
		int nbM1=0,nbM2=0;
		
		for(Empruntable e: a1.listeMateriel()) {
			if(e.defectueux) {
				nbM1++;
			}
		}
		
		
		for(Empruntable e: a2.listeMateriel()) {
			if(e.defectueux) {
				nbM2++;
			}
		}
		
		if(nbM1<nbM2)
			return nbM2;
		else 
			return nbM1;
	}

}
