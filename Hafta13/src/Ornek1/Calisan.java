package Ornek1;

import java.util.ArrayList;

public class Calisan {
	public int id;
	public String ad;
	public String soyad;
	public int yas;
	public ArrayList <Cocuk> cocuklar;
	
	public Calisan(int id, String ad, String soyad, int yas) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		cocuklar = new ArrayList<Cocuk>();
	}
	
	
	
}
