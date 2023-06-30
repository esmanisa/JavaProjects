package ornek;

public class BilgisayarMuhendisi extends Muhendis{

	public BilgisayarMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans = "Bilgisayar Muhendisi";
	}

	@Override
	public void bilgileriYazdir() {
		System.out.println("-------------Bilgisayar Muhendisi Sınıfı-------------");
		System.out.println("Muhendis ad: "+this.ad);
		System.out.println("Muhendis yas: "+this.yas);
		System.out.println("Muhendis brans: "+this.brans);
		System.out.println("-----------------------------------------------------");
	}

	@Override
	public int puanHesapla() {
		return this.puan = yas*4;
	}
	
}
