package sporMerkezi;

import java.util.ArrayList;
import java.util.List;

public class Kursiyer {
	private int kursiyerID;
	private String kursiyerAdSoyad;
	private int kursiyerYas;
	public ArrayList<Kurs> alinanKurslar;
	
	public Kursiyer(int kursiyerID, String kursiyerAdSoyad, int kursiyerYas) {
		this.kursiyerID = kursiyerID;
		this.kursiyerAdSoyad = kursiyerAdSoyad;
		this.kursiyerYas = kursiyerYas;
		alinanKurslar = new ArrayList<Kurs>();
	}

	public int getKursiyerID() {
		return kursiyerID;
	}

	public void setKursiyerID(int kursiyerID) {
		this.kursiyerID = kursiyerID;
	}

	public String getKursiyerAdSoyad() {
		return kursiyerAdSoyad;
	}

	public void setKursiyerAdSoyad(String kursiyerAdSoyad) {
		this.kursiyerAdSoyad = kursiyerAdSoyad;
	}

	public int getKursiyerYas() {
		return kursiyerYas;
	}

	public void setKursiyerYas(int kursiyerYas) {
		this.kursiyerYas = kursiyerYas;
	}
	
	
	
}
