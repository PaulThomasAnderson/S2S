
public class Student1 {
	private String ime;
	private String prezime;
	private int godinaUpisa;
	private int brIndeksa;
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
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	public int getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	@Override
	public String toString() {
		return "Student1 [ime=" + ime + ", prezime=" + prezime + ", godinaUpisa=" + godinaUpisa + ", brIndeksa="
				+ brIndeksa + "]";
	}
	public Student1(String ime, String prezime, int godinaUpisa, int brIndeksa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godinaUpisa = godinaUpisa;
		this.brIndeksa = brIndeksa;
	}
	
	
	
}
