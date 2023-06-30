package Hastane;

public class Noroloji extends Isgucu{

	private String diploma_ald�g�_kurum;
	
	public Noroloji(String ad, String soyad, String kimlikNo, String diploma_ald�g�_kurum) {
		super(ad, soyad, kimlikNo);
		this.diploma_ald�g�_kurum=diploma_ald�g�_kurum;
		// TODO Auto-generated constructor stub
	}
	void uyku_bozuklugu() throws InterruptedException
	{
		System.out.println("Doktor "+getAd()+" taraf�ndan uyku bozuklu�una dair tedavi uygulan�yor...");
		Thread.sleep(3000);
		System.out.println("Tedavi ba�ar� ile ger�ekle�ti.");
	}
	void bas_agrisi() throws InterruptedException
	{
		System.out.println("Doktor "+getAd()+" taraf�ndan ba� a�r�s� tedavisi uygulan�yor...");
		Thread.sleep(3000);
		System.out.println("Tedavi ba�ar�yla ger�ekle�ti.");
	}
	@Override
	void yaka_kart�_oku() {
		// TODO Auto-generated method stub
		super.yaka_kart�_oku();
		System.out.println("Diplama ald��� y�ksek ��retim kurumu: "+diploma_ald�g�_kurum);
	}
	
}
