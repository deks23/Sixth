package sixth;

public abstract class Wpis {

	private nrTelefoniczny numerTelefonu;
	public abstract String opis();
	
	public Wpis (long nrKierunkowy, long nrTelefonu) {
		this.numerTelefonu = new nrTelefoniczny(nrKierunkowy, nrTelefonu);
	}
	
	public nrTelefoniczny getNumerTelefonu() {
		return numerTelefonu;
	}
}
