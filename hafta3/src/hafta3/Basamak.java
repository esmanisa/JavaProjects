/*Kullan�c�dan al�nan bir say�n�n basamaklar� toplam�n� ve basamak say�s�n� ekrana yazd�ran Java kodu*/

package hafta3;

import java.util.Scanner;

public class Basamak {
	public static void main(String [] args)
	{
		int toplam=0, kalan, bs = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Sayiyi giriniz: ");
		int sayi=scanner.nextInt();
		while (sayi>0)
		{
			kalan=sayi%10;
			toplam+=kalan;
			sayi=sayi-kalan;
			sayi=sayi/10;
			bs++;
		}
		System.out.println("Say�n�n basamaklar toplam�: "+toplam+" basamak say�s�: "+bs);
	}
}
