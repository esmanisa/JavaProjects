package Jenerik;

public class AnaSayfa {

	public static void main(String[] args) {
		
		Ogrenci ogr=new Ogrenci("Ali", "Kýlýnç", 1010);
		
		Jenerik <Integer> nesne1=new Jenerik<Integer>(10);
		Jenerik <String> nesne2=new Jenerik<String>("Ali");
		Jenerik <Double> nesne3=new Jenerik <Double>(5.8);
		Jenerik <Ogrenci> nesne4=new Jenerik<Ogrenci>(ogr);
		
		nesne1.nesneBilgileriniGoruntule();
		nesne2.nesneBilgileriniGoruntule();
		nesne3.nesneBilgileriniGoruntule();
		nesne4.nesneBilgileriniGoruntule();
	}

}
