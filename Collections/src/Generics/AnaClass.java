package Generics;

public class AnaClass {
	public static void main(String[] args)
	{
		Hayvan h1=new Hayvan();
		OrdekYavrusu o1=(OrdekYavrusu) new Ordek();
		
		h1.beslenme("Hayvan");
		o1.beslenme("Ordek Yavrusu");
	}
}

class Hayvan{
	public void beslenme(String str) {
		System.out.println("Hayvan besleniyor.");
	}
}

class Ordek extends Hayvan{
	public void beslenme(String str) {
		System.out.println("Ördek ot yiyor.");
	}
}

class OrdekYavrusu extends Ordek {
	public void beslenme(String str) {
		System.out.println("Ördek yavrusu yem yiyor.");
	}
}