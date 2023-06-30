package ornek;

public class Muhendis {
	public String brans;
	public String ad;
	public int yas;
	public int puan;
	
	public Muhendis(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
		this.brans = "Muhendis";
	}
	
	public void bilgileriYazdir()
	{
		System.out.println("-------------Muhendis Sınıfı-------------");
		System.out.println("Muhendis ad: "+this.ad);
		System.out.println("Muhendis yas: "+this.yas);
		System.out.println("Muhendis brans: "+this.brans);
		System.out.println("-----------------------------------------");
	}
	
	public int puanHesapla()
	{
		return this.puan = yas*3;
	}
}
