package hafta7quiz;

public class Ogretmen_1860 {
	public String ad;
	public String soyad;
	public int yas;
	public String brans;
	private static int count=0;
	
	public Ogretmen_1860(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		count = ++count;
	}
	
	void BilgieriYazdir()
	{
		System.out.println("***��retmen Bilgileri***");
		System.out.println("Ad� Soyad�: "+ad+" "+soyad);
		System.out.println("Ya��: "+yas);
		System.out.println("Bran��: "+brans);
	}
	
	final void OgretmenSayisiVer()
	{
		System.out.println("��retmen sayisi: "+count);
	}
}
