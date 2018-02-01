package sixth;

public class Osoba extends Wpis {
	private String imie, nazwisko, adres;


	public Osoba (String imie, String nazwisko, String adres, long nrKierunkowy, long nrTelefonu) {
		super(nrKierunkowy, nrTelefonu);
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		
	}
	@Override
	public String opis() {
		return(imie + " " + nazwisko + ", " + adres + ", " + getNumerTelefonu().getNr());
	}

	

}
