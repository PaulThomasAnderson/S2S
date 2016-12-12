package s2s;

public class Student {
	private String ime;
	private String prezime;
	private String brIndexa;
	private String godinaUpisa;
	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", brIndexa=" + brIndexa + ", godinaUpisa="
				+ godinaUpisa + "]";
	}
	public Student(String ime, String prezime, String brIndexa, String godinaUpisa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brIndexa = brIndexa;
		this.godinaUpisa = godinaUpisa;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(String godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
}
