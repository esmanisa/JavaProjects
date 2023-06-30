package ornek;

public class AnaSayfa {
	public static void main(String[] args)
	{
		DikUcgen du=new DikUcgen(3, 4);
		du.ucgenTipiYazdýr();
		du.cevreHesapla();
		du.alanHesapla();
		
		EskenarUcgen eu=new EskenarUcgen(4,4,30);
		eu.ucgenTipiYazdýr();
		eu.alanHesapla();
	}
}
