package ornek;

public class AnaSayfa {
	public static void main(String[] args)
	{
		DikUcgen du=new DikUcgen(3, 4);
		du.ucgenTipiYazd�r();
		du.cevreHesapla();
		du.alanHesapla();
		
		EskenarUcgen eu=new EskenarUcgen(4,4,30);
		eu.ucgenTipiYazd�r();
		eu.alanHesapla();
	}
}
