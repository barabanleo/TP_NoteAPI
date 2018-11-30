package testMaven;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {

	List<Empruntable> stock=new ArrayList<Empruntable>();
	
	
	public void ajouterAuStock(Empruntable e) {
		stock.add(e);
	}
	
	public List<Empruntable> listeMateriel(){
		return stock;
		
	}
	
	public Boolean perdreMateriel(Empruntable e) {
		
		return stock.remove(e);
		
	}
}
