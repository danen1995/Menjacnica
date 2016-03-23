package interfejsi;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface MenjacnicaInterfejs {
	public void dodajKursValute(String nazivValute, GregorianCalendar datum, double prodajni, double srednji, double kupovni);
	public void izbrisiKursValute(String nazivValute, GregorianCalendar datum);
	public Kurs pronadjiKursValute(String nazivValute, GregorianCalendar datum);
}
