package ornek;

public class DikUcgen extends Ucgen implements Alan, Cevre{

	int aci;
	public DikUcgen(int kenar1, int kenar2) {
		super(kenar1, kenar2);
		aci=90;
		kenar3=(int) Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
	}

	@Override
	public void cevreHesapla() {
		System.out.println("Dik Üçgenin çevresi "+(kenar1+kenar2+kenar3));
	}

	@Override
	public void alanHesapla() {
		double alan = (kenar1*kenar2)/2;
		System.out.println("Dik üçgenin alaný "+alan);
	}

	@Override
	public void ucgenTipiYazdýr() {
		System.out.println("Dik üçgen");
	}
	
}
