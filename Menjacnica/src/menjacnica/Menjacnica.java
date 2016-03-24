package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public LinkedList<Valuta> getValute() {
		return valute;
	}
	
	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}
	
	public void dodajKursValute(String nazivValute, GregorianCalendar datum, double prodajni, double srednji, double kupovni){
		
		Kurs kurs = new Kurs();
		kurs.setDatum(datum);
		kurs.setKupovniKurs(kupovni);
		kurs.setProdajniKurs(prodajni);
		kurs.setSrednjiKurs(srednji);
		
		if(nazivValute == null || datum == null){
			throw new RuntimeException("Greska.");
		}
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)){
				valute.get(i).getKursevi().add(kurs);
			}
		}
	}
	
	public void izbrisiKursValute(String nazivValute, GregorianCalendar datum){
		if(nazivValute == null || datum == null){
			throw new RuntimeException("Greska.");
		}
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)){
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().compareTo(datum)==0){
						valute.get(i).getKursevi().remove(valute.get(i).getKursevi().get(j));
						return;
						
					}
				}
			}
		}
	}

	public Kurs pronadjiKursValute(String nazivValute, GregorianCalendar datum){
		if(nazivValute == null || datum == null){
			throw new RuntimeException("Greska.");
		}
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute)){
				for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
					if(valute.get(i).getKursevi().get(j).getDatum().compareTo(datum)==0){
						return valute.get(i).getKursevi().get(j);
					}
				}
			}
		}
		
		
		return null;
	}
}
