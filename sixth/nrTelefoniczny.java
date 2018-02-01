package sixth;

public class nrTelefoniczny implements Comparable<nrTelefoniczny> {
	long  nrKieruntowy, nrTelefonu;

	public nrTelefoniczny(long nrKier, long nrTel) {
		nrKieruntowy = nrKier;
		nrTelefonu = nrTel;
	}

	@Override
	public int compareTo(nrTelefoniczny o) {
		int compare = getNr().compareTo(o.getNr());
		return compare;
	}

	public String getNrTelefonu() {
		return Long.toString(nrKieruntowy) + " " + Long.toString(nrTelefonu);
	}
	public Long getNr() {
		return Long.parseLong(Long.toString(nrKieruntowy) + Long.toString(nrTelefonu));
	}
}
