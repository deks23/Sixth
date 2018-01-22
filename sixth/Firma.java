package sixth;

public class Firma extends Wpis {
	private String nazwa, adres;
	private nrTelefoniczny numerTelefonu;

	public Firma(String nazwa, String adres, long nrKierunkowy, long nrTelefonu) {
		this.nazwa = nazwa;
		this.adres = adres;
		this.numerTelefonu = new nrTelefoniczny(nrKierunkowy, nrTelefonu);
	}

	@Override
	public void opis() {
		System.out.println(nazwa + " " + adres + " " + numerTelefonu.getNrTelefonu());
	}

}
