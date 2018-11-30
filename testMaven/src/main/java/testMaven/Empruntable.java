package testMaven;

public class Empruntable {
	boolean limatationPretAuxAgence;
	boolean defectueux;

	public void declarerDefectueux() {
		this.defectueux=true;
	}
	
	public boolean isDefectueux() {
		return defectueux;
	}
	
	public boolean isLimitationPretAuxAgences() {
		return limatationPretAuxAgence;
	}
	
	public void setLimitationPretAuxAgences(boolean b) {
		limatationPretAuxAgence=b;
	}
	


}
