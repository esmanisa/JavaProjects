package otomasyon;

public class Personel{
	private int perID;
	private static int count=0;
	private String perAd;
	private String perSoyad;
	private int perYas;
	private int depNo;
	
	public Personel(int depNo, String perAd, String perSoyad, int perYas) {
		this.depNo = depNo;
		this.perID = ++count;
		this.perAd = perAd;
		this.perSoyad = perSoyad;
		this.perYas = perYas;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	public int getPerID() {
		return perID;
	}

	public String getPerAd() {
		return perAd;
	}

	public void setPerAd(String perAd) {
		this.perAd = perAd;
	}

	public String getPerSoyad() {
		return perSoyad;
	}

	public void setPerSoyad(String perSoyad) {
		this.perSoyad = perSoyad;
	}

	public int getPerYas() {
		return perYas;
	}

	public void setPerYas(int perYas) {
		this.perYas = perYas;
	}

}
