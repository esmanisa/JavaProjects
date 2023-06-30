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
		System.out.println("***Resim Öðretmeni Bilgileri***");
		System.out.println("ID numarasý: "+id);
		System.out.println("Adý Soyadý: "+ad+" "+soyad);
		System.out.println("Yaþý: "+yas);
		System.out.println("Branþý: "+brans);
		System.out.println("Görev süresi: "+gs);
		System.out.println("Tecrübe puaný: "+tp);
	}
	

}
