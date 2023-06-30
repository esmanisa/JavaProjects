package Abstract;

public abstract class AbMuhendis {
	public String brans;
	public String ad;
	public int yas;
	public int puan;
	
	public AbMuhendis(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
		this.brans = "Muhendis";
	}
	
	public void bilgileriYazdir()
	{
		System.out.println("-----------------------------------------");
		System.out.println("Muhendis ad: "+this.ad);
		System.out.println("Muhendis yas: "+this.yas);
		System.out.println("Muhendis brans: "+this.brans);
		System.out.println("-----------------------------------------");
	}
	
	public abstract int puanHesapla();
	
}
