package Jenerik2;

public class Ogrenci {
	
	public String ad;
	public String soyad;
	public int no;
	
	public Ogrenci(int no, String ad, String soyad) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.no = no;
	}
	
	public String toString()
	{
		return "Öðrenci Bilgileri: "+no+" "+ad+" "+soyad;
	}
	
}
