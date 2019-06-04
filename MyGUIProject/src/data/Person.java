package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> liste = new ArrayList<Person>();
	//
	private String vorname;
	private String nachname;
	private String straﬂe;
	private String hausnummer;
	private String PLZ;
	private String ort;
	//
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getStraﬂe() {
		return straﬂe;
	}
	public void setStraﬂe(String straﬂe) {
		this.straﬂe = straﬂe;
	}
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public String getPLZ() {
		return PLZ;
	}
	public void setPLZ(String pLZ) {
		PLZ = pLZ;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public String toString() {
		return getNachname() + ", " + getVorname();
	
	}
	public static ArrayList<Person> getListe() {
		return liste;
	}
	public static void setListe(ArrayList<Person> personenListe) {
		// TODO Auto-generated method stub
		
	}
	
	

}
