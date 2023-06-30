package Hastane;

public class Isgucu {
	private String ad;
	private String soyad;
	private String kimlikNo;
	
	public Isgucu(String ad, String soyad, int i) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.kimlikNo = i;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public String getKimlikNo() {
		return kimlikNo;
	}
	
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	
	void yaka_kartý_oku()
	{
		System.out.println("Ad: "+ad);
		System.out.println("Soyad: "+soyad);
		System.out.println("Kimlik no: "+kimlikNo);
	}
}
