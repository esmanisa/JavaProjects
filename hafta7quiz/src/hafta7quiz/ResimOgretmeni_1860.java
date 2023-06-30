package hafta7quiz;

public class ResimOgretmeni_1860 extends Ogretmen_1860{

	private int id=0;
	public int gs;
	public double tp;
	
	public ResimOgretmeni_1860(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		this.id = ++id;
		this.tp = gs*0.3;
		brans = "Resim";
	}

	@Override
	void BilgieriYazdir() {
		System.out.println("***Resim ��retmeni Bilgileri***");
		System.out.println("ID numaras�: "+id);
		System.out.println("Ad� Soyad�: "+ad+" "+soyad);
		System.out.println("Ya��: "+yas);
		System.out.println("Bran��: "+brans);
		System.out.println("G�rev s�resi: "+gs);
		System.out.println("Tecr�be puan�: "+tp);
	}
	

}
