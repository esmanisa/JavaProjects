package Jenerik2;

public class AnaSayfa {
	
	public static <T> String bilgiler(T t)
	{
		System.out.println("Sýnýf Bilgisi: "+t.getClass().getName());
		return t.toString();
	}
	
	public static void main(String[] args)
	{
		Ogrenci ogr=new Ogrenci(110, "Nisa", "Berk");
		Ogretmen ogret=new Ogretmen("Ali", "Osman", "Matematik", 40);
		
		System.out.println(bilgiler(ogr));
		System.out.println(bilgiler(ogret));
	}
}
