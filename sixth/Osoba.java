package sixth;

public class Osoba extends Wpis {
	private String imie, nazwisko, adres;
	private nrTelefoniczny numerTelefonu;

	public Osoba (String imie, String nazwisko, String adres, long nrKierunkowy, long nrTelefonu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.numerTelefonu = new nrTelefoniczny(nrKierunkowy, nrTelefonu);
	}
	@Override
	public void opis() {
		System.out.println(imie + " " + nazwisko + " " + adres + " " + numerTelefonu.getNrTelefonu());
	}
	public nrTelefoniczny getNumerTelefonu() {
		return numerTelefonu;
	}
	

}
