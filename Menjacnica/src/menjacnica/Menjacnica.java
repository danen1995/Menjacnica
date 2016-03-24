package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public LinkedList<Valuta> getValute() {
		return valute;
	}
	
	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}
	
	public void dodajKursValute(String nazivValute, GregorianCalendar datum, double prodajni, double srednji, double kupovni){
		Kurs k = new Kurs();
		k.setSrednjiKurs(srednji);
		k.setDatum(datum);
		k.setKupovniKurs(kupovni);
		k.setProdajniKurs(prodajni);
		if(nazivValute == null || datum == null){
			 throw new RuntimeException("Greska.");
		}
 		for (int i = 0; i < valute.size(); i++) {
			 	if(valute.get(i).getNaziv().equals(nazivValute)){
			 			valute.get(i).getKursevi().add(k);
			 	}
		}
	}
	
	public void izbrisiKursValute(String nazivValute, GregorianCalendar datum){
		
	}
	public Kurs pronadjiKursValute(String nazivValute, GregorianCalendar datum){
		return null;
	}
}
