package sixth;

public class Firma extends Wpis {
	private String nazwa, adres;
	

	public Firma(String nazwa, String adres, long nrKierunkowy, long nrTelefonu) {
		super(nrKierunkowy, nrTelefonu);
		this.nazwa = nazwa;
		this.adres = adres;
		
	}

	@Override
	public String opis() {
		return(nazwa + ", " + adres + ", " + getNumerTelefonu().getNr());
	}



}
