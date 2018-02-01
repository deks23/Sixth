package sixth;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sixth {

	public static void main(String[] args) {
		Wpis[] wp  = new Wpis[6];
		wp[0] = new Osoba("Adam", "Piaseczny", "Pomorska 12", 48, 665442512);
		wp[1] = new Osoba("Zbigniew", "Wodecki", "Gdanska 15", 12, 662331441);
		wp[2] = new Osoba("Jan", "Kowalski", "Wolczanska 13", 10, 331441661);
		wp[3] = new Firma("DachPol", "Wolczanska 11", 56, 991001772);
		wp[4] = new Firma("Drutex", "Lumumby 3", 89, 648729618);
		wp[5] = new Firma("Drewpol", "Palki 3", 45, 112774992);
		
		TreeMap<nrTelefoniczny, Wpis> tmap = new TreeMap<nrTelefoniczny, Wpis>();
		
		for( Wpis i : wp) {
			tmap.put(i.getNumerTelefonu(), i);
		}
		
		Set<Map.Entry<nrTelefoniczny, Wpis>> pa = tmap.entrySet();
	
		for (Map.Entry<nrTelefoniczny, Wpis> i : pa) {
			System.out.println(i.getValue().opis());
			System.out.print("\n");
		}
	
		
		
	}

}
