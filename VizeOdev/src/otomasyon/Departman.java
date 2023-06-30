package otomasyon;

public class Departman {
	int depNo;
	String depAd;
	public Personel[] personeller;
	public Servis[] servisler;

	public Departman(int depNo, String depAd, Personel[] personeller, Servis[] servisler) {
		this.depNo = depNo;
		this.depAd = depAd;
		this.personeller = personeller;
		this.servisler = servisler;
	}

	public int getDepNo() {
		return depNo;
	}
	
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	
	public String getDepAd() {
		return depAd;
	}
	
	public void setDepAd(String depAd) {
		this.depAd = depAd;
	}
	
	
}
