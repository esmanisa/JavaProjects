package ornek;

public class MakineMuhendisi extends Muhendis{

	public MakineMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans = "Makine Muhendisi";
	}

	@Override
	public void bilgileriYazdir() {
		System.out.println("-------------Makine Muhendisi Sınıfı-------------");
		System.out.println("Muhendis ad: "+this.ad);
		System.out.println("Muhendis yas: "+this.yas);
		System.out.println("Muhendis brans: "+this.brans);
		System.out.println("-----------------------------------------------------");
	}
}
