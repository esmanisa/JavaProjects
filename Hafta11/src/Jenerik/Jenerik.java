package Jenerik;

public class Jenerik <T> {
	T nesne;

	public Jenerik(T nesne) {
		this.nesne = nesne;
	}
	
	public void nesneBilgileriniGoruntule()
	{
		System.out.println("S�n�f Bilgisi: "+nesne.getClass().getName());
		System.out.println("De�eri: "+nesne.toString());
		System.out.println("-------------------------------------------");
	}
}
