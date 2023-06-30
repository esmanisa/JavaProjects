package Projects;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		PriorityQueue<AracGecisUstunlugu> a=new PriorityQueue<>();
		String s="S�r�c� ad� ve ara� t�r�n� giriniz\n"
				+ "Ara� T�rleri: Kargo, Polis, �tfaiye veya Ambulans olabilir.";
		System.out.println(s);
		
		while(a.size()<4)
		{
			System.out.print("S�r�c� ad�: ");
			String surucu_ad=scanner.nextLine();
			System.out.print("Ara� t�r�: ");
			String arac_turu=scanner.nextLine();
			a.add(new AracGecisUstunlugu(surucu_ad, arac_turu));
		}
		int b=1;
		while(!a.isEmpty())
		{
			System.out.println("");
			System.out.println("Arac�n trafikteki ge�i� �st�nl��� s�ralamas�: "+b);
			System.out.println(a.poll());
			b++;
		}
	}

}
