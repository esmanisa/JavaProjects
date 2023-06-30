package Course;

public class Calistir {
	public static void main(String[] args)
	{
		Yolcu o1=new Yolcu("Ziya Gökalp", "ÇAMLICA");
		Yolcu o2=new Yolcu("Halide Edip", "BAKKAL");
		Yolcu o3=new Yolcu("Sabahattin Ali", "KUYUCAK");
		Yolcu o4=new Yolcu("Reþat Nuri", "HAYDARPAÞA");
		o1.cikti();
		o2.cikti();
		o3.cikti();
		o4.cikti();
		
		System.out.println("Otobüsteki yolcu sayýsý: "+Yolcu.getYolcu_sayisi());
	}
}
