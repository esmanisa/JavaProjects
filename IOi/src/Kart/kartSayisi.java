package Kart;

import java.util.Scanner;

public class kartSayisi {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		int sehirSayisi, kayipSayisi;
		String caresizlik;
		
		System.out.print("Kaç þehre gittiniz? ");
		sehirSayisi = scanner.nextInt();
		System.out.println("");
		System.out.println("Sahip olduðunuz kart sayisi: "+sehirSayisi);
		System.out.println("");

		System.out.print("Kaç kart kaybettiniz? ");
		kayipSayisi = scanner.nextInt();

		System.out.println("Sahip olduðunuz kart sayisi: " + (sehirSayisi - kayipSayisi));
		System.out.println("");

		System.out.print("Çaresiz misiniz:");
		caresizlik = scanner.next();
		
		if(caresizlik == "Hayýr")
			System.out.println("Allah yolunuzu açýk etsin :)");
		else
			System.out.println("CardApp kullanýn :)");

			
	}

}
