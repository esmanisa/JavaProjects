package Kart;

import java.util.Scanner;

public class kartSayisi {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		int sehirSayisi, kayipSayisi;
		String caresizlik;
		
		System.out.print("Ka� �ehre gittiniz? ");
		sehirSayisi = scanner.nextInt();
		System.out.println("");
		System.out.println("Sahip oldu�unuz kart sayisi: "+sehirSayisi);
		System.out.println("");

		System.out.print("Ka� kart kaybettiniz? ");
		kayipSayisi = scanner.nextInt();

		System.out.println("Sahip oldu�unuz kart sayisi: " + (sehirSayisi - kayipSayisi));
		System.out.println("");

		System.out.print("�aresiz misiniz:");
		caresizlik = scanner.next();
		
		if(caresizlik == "Hay�r")
			System.out.println("Allah yolunuzu a��k etsin :)");
		else
			System.out.println("CardApp kullan�n :)");

			
	}

}
