package Abstract;

public class ElkMuh extends AbMuhendis{

	public ElkMuh(String ad, int yas) {
		super(ad, yas);
		this.brans =  "Elektrik Muhendisi";
	}

	@Override
	public int puanHesapla() {
		return this.puan = yas*5;
	}

}
