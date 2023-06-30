package Abstract;

public class BilMuh extends AbMuhendis{

	public BilMuh(String ad, int yas) {
		super(ad, yas);
		this.brans = "Bilgisayar Muhendisi";
	}

	@Override
	public int puanHesapla() {
		return this.puan = yas*4;
	}

}
