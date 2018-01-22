package sixth;

public class nrTelefoniczny implements Comparable<nrTelefoniczny> {
	long  nrKieruntowy, nrTelefonu;

	public nrTelefoniczny(long nrKier, long nrTel) {
		nrKieruntowy = nrKier;
		nrTelefonu = nrTel;
	}

	@Override
	public int compareTo(nrTelefoniczny o) {
		return 0;
	}

	public String getNrTelefonu() {
		return Long.toString(nrKieruntowy) + " " + Long.toString(nrTelefonu);
	}
	public long getNr() {
		return Long.parseLong(Long.toString(nrKieruntowy) + Long.toString(nrTelefonu));
	}
}
