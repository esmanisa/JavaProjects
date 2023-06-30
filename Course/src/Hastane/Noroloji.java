package Hastane;

public class Noroloji extends Isgucu{

	private String diploma_aldýgý_kurum;
	
	public Noroloji(String ad, String soyad, String kimlikNo, String diploma_aldýgý_kurum) {
		super(ad, soyad, kimlikNo);
		this.diploma_aldýgý_kurum=diploma_aldýgý_kurum;
		// TODO Auto-generated constructor stub
	}
	void uyku_bozuklugu() throws InterruptedException
	{
		System.out.println("Doktor "+getAd()+" tarafýndan uyku bozukluðuna dair tedavi uygulanýyor...");
		Thread.sleep(3000);
		System.out.println("Tedavi baþarý ile gerçekleþti.");
	}
	void bas_agrisi() throws InterruptedException
	{
		System.out.println("Doktor "+getAd()+" tarafýndan baþ aðrýsý tedavisi uygulanýyor...");
		Thread.sleep(3000);
		System.out.println("Tedavi baþarýyla gerçekleþti.");
	}
	@Override
	void yaka_kartý_oku() {
		// TODO Auto-generated method stub
		super.yaka_kartý_oku();
		System.out.println("Diplama aldýðý yüksek öðretim kurumu: "+diploma_aldýgý_kurum);
	}
	
}
