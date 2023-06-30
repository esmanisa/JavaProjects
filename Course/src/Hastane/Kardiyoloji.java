package Hastane;

public class Kardiyoloji extends Isgucu {
	
	private String unvan;
	
	public Kardiyoloji(String ad, String soyad, String kimlikNo) {
		super(ad, soyad, kimlikNo);
		this.unvan=unvan;
	}
	void riskHesapla() throws InterruptedException
	{
		System.out.println(unvan+" doktor "+getAd()+"tarafýndan kalp krizi riski hesaplanýyor...");
		Thread.sleep(3000);
		System.out.println("Ýnceleme baþarý ile tamamlandý.");
	}
	
	void ekg_cek() throws InterruptedException
	{
		System.out.println(unvan+" doktor "+getAd()+" tarafýndan EKG çekiliyor...");
		Thread.sleep(3000);
		System.out.println("EKG baþarýyla çekildi.");
	}
	
	@Override
	void yaka_kartý_oku() {
		super.yaka_kartý_oku();
		System.out.println("Unvan: "+unvan);
	}
	
}
