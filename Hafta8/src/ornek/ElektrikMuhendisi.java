package ornek;

public class ElektrikMuhendisi extends Muhendis{

	public ElektrikMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans = "Elektrik Muhendisi";
	}

	@Override
	public void bilgileriYazdir() {
		System.out.println("-------------Elektrik Muhendisi Sınıfı-------------");
		System.out.println("Muhendis ad: "+this.ad);
		System.out.println("Muhendis yas: "+this.yas);
		System.out.println("Muhendis brans: "+this.brans);
		System.out.println("-----------------------------------------------------");
	}

	@Override
	public int puanHesapla() {
		return this.puan = yas*5;
	}

	
}
