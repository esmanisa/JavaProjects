package Course;

import java.util.Random;

public class Sekreter {
	Random random=new Random();
	private String ad;
	private int ucret=3000;
	private int fatura_no=random.nextInt(20);
	
	public Sekreter(String ad) {
		this.ad = ad;
	}
	
	public Random getRandom() {
		return random;
	}
	
	public void setRandom(Random random) {
		this.random = random;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getUcret() {
		return ucret;
	}
	
	public void setUcret(int ucret) {
		this.ucret = ucret;
	}
	
	public int getFatura_no() {
		return fatura_no;
	}
	
	public void setFatura_no(int fatura_no) {
		this.fatura_no = fatura_no;
	}
	
	void islemSonucu() {
		String s="Kurs kay�t i�lemininiz sekrterimiz "+ad+" taraf�ndan i�leme al�nd�.\n"
				+ "L�tfen ilgili fatura numaras�n� kullanarak muhasebe birimine iletininz.\n"
				+ "Fatura numaran�z: "+fatura_no;
		System.out.println(s);
		System.out.println("");
	}
}
