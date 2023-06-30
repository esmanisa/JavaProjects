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
		System.out.println("Dik ��genin �evresi "+(kenar1+kenar2+kenar3));
	}

	@Override
	public void alanHesapla() {
		double alan = (kenar1*kenar2)/2;
		System.out.println("Dik ��genin alan� "+alan);
	}

	@Override
	public void ucgenTipiYazd�r() {
		System.out.println("Dik ��gen");
	}
	
}
