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
		System.out.println("***Öðretmen Bilgileri***");
		System.out.println("Adý Soyadý: "+ad+" "+soyad);
		System.out.println("Yaþý: "+yas);
		System.out.println("Branþý: "+brans);
	}
	
	final void OgretmenSayisiVer()
	{
		System.out.println("Öðretmen sayisi: "+count);
	}
}
