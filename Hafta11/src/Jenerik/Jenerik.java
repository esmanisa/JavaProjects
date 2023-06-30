package Jenerik;

public class Jenerik <T> {
	T nesne;

	public Jenerik(T nesne) {
		this.nesne = nesne;
	}
	
	public void nesneBilgileriniGoruntule()
	{
		System.out.println("Sýnýf Bilgisi: "+nesne.getClass().getName());
		System.out.println("Deðeri: "+nesne.toString());
		System.out.println("-------------------------------------------");
	}
}
