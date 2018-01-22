package sixth;

import java.util.TreeMap;

public class Sixth {

	public static void main(String[] args) {
		
		Osoba q = new Osoba("Adam", "Piaseczny", "Pomorska 12", 48, 665442512);
		Osoba w = new Osoba("Zbigniew", "Wodecki", "Gdańska 15", 12, 662331441);
		Osoba e = new Osoba("Jan", "Kowalski", "Wolczanska 13", 10, 331441661);
		Firma r = new Firma("DachPol", "Wolczanska 11", 56, 991001772);
		Firma t = new Firma("Drutex", "Lumumby 3", 89, 648729618);
		Firma y = new Firma("Drewpol", "Palki 3", 45, 112774992);
		TreeMap<nrTelefoniczny, Wpis> tmap = new TreeMap<nrTelefoniczny, Wpis>();
		System.out.println(q.getNumerTelefonu().getNr());
		System.out.println(q.getNumerTelefonu().getNrTelefonu());
	}

}
