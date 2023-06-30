package ornek;

public class EskenarUcgen extends Ucgen implements Alan{

	public EskenarUcgen(int kenar1, int kenar2, int aci) {
		super(kenar1, kenar2);
		this.aci = aci;
	}
	public int aci;
	


	@Override
	public void alanHesapla() {
		double alan;
		alan = (kenar1*kenar2*Math.sin(aci))/2;
		if(alan<0)
			alan = alan*(-1);
		
		System.out.println("�kizkenar ��genin alan� "+alan);
	}
	@Override
	public void ucgenTipiYazd�r() {
		System.out.println("�kizkenar ��gen.");		
		
	}

}
