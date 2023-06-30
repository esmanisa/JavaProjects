package Hastane;

public class Kardiyoloji extends Isgucu {
	
	private String unvan;
	
	public Kardiyoloji(String ad, String soyad, String kimlikNo) {
		super(ad, soyad, kimlikNo);
		this.unvan=unvan;
	}
	void riskHesapla() throws InterruptedException
	{
		System.out.println(unvan+" doktor "+getAd()+"taraf�ndan kalp krizi riski hesaplan�yor...");
		Thread.sleep(3000);
		System.out.println("�nceleme ba�ar� ile tamamland�.");
	}
	
	void ekg_cek() throws InterruptedException
	{
		System.out.println(unvan+" doktor "+getAd()+" taraf�ndan EKG �ekiliyor...");
		Thread.sleep(3000);
		System.out.println("EKG ba�ar�yla �ekildi.");
	}
	
	@Override
	void yaka_kart�_oku() {
		super.yaka_kart�_oku();
		System.out.println("Unvan: "+unvan);
	}
	
}
