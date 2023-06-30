package quiz;

public abstract class Calisan {
	public int id;
	public String ad;
	public String soyad;
	public int yas;
	public int cs;
	private static int count=1000;
	
	public Calisan(String ad, String soyad, int yas, int cs) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cs = cs;
		count += 2;
		this.id = count;
	}
	
	public abstract double  ZamOraniHesapla();
}
