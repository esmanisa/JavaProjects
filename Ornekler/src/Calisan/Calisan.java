package Calisan;

public class Calisan {
	private int id=0;
	private String isim;
	private String soyisim;
	private int yas;
	private int cocukSayisi;
	private double maas;
	
	public Calisan(String isim, String soyisim, int yas, int cocukSayisi, double maas) {
		super();
		this.id++;
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
		this.cocukSayisi = cocukSayisi;
		this.maas = maas;
	}
	
	public Calisan(String isim, String soyisim, int yas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
		this.cocukSayisi = 0;
		this.maas = 0;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getCocukSayisi() {
		return cocukSayisi;
	}

	public void setCocukSayisi(int cocukSayisi) {
		this.cocukSayisi = cocukSayisi;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public void bilgileriYazdir()
	{
		System.out.println("***�al��an�n Bilgileri***");
		System.out.println("ID numaras�: "+id);
		System.out.println("Ad� soyad�: "+isim+" "+soyisim);
		System.out.println("Ya��: "+yas);
		System.out.println("�ocuk say�s�: "+cocukSayisi);
		System.out.println("Maa��: "+maas);
	}
	
	double yeniMaas;
	
	public void yeniMaasHesapla()
	{
		System.out.println("�al��an�n yeni maa�� hesaplan�yor...");
		if (cocukSayisi != 0)
		{
			yeniMaas = cocukSayisi*maas*0.015 + maas;
		}
		else if (yas > 40)
		{
			yeniMaas = maas + maas*0.035;
		}
		else if (yas < 40 && cocukSayisi == 0)
		{
			yeniMaas = maas + maas*0.025;
		}
		else if (yas < 40)
		{
			yeniMaas = maas + maas*0.03;
		}
		else if (maas < 2500)
		{
			yeniMaas = maas + maas*0.05;
		}
		
		maas = yeniMaas;
		System.out.println("Yeni maa�: "+maas);
	}
	
}
