package Projects;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		PriorityQueue<AracGecisUstunlugu> a=new PriorityQueue<>();
		String s="Sürücü adý ve araç türünü giriniz\n"
				+ "Araç Türleri: Kargo, Polis, Ýtfaiye veya Ambulans olabilir.";
		System.out.println(s);
		
		while(a.size()<4)
		{
			System.out.print("Sürücü adý: ");
			String surucu_ad=scanner.nextLine();
			System.out.print("Araç türü: ");
			String arac_turu=scanner.nextLine();
			a.add(new AracGecisUstunlugu(surucu_ad, arac_turu));
		}
		int b=1;
		while(!a.isEmpty())
		{
			System.out.println("");
			System.out.println("Aracýn trafikteki geçiþ üstünlüðü sýralamasý: "+b);
			System.out.println(a.poll());
			b++;
		}
	}

}
