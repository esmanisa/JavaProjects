package Course;

import java.util.Scanner;

public class ZarOyunu {
	public static void main(String[] args)
	{
		char t='t';
		int zar1,zar2=0,oyuncu1=0,oyuncu2=0, sayac=0, fark=0;
		Scanner scanner=new Scanner(System.in);
		String a="Birinci oyuncunun sahip olduðu para miktarý: ";
		System.out.print(a);
		oyuncu1=scanner.nextInt();
		String b="Ýkinci oyuncunun sahip olduðu para miktarý: ";
		System.out.print(b);
		oyuncu2=scanner.nextInt();
		
		while(oyuncu1>0 && oyuncu2>0 && t=='t')
		{
			sayac++;
			System.out.println("Þu anda oyunun "+sayac+". turundasýnýz.");
			zar1=((int) (Math.random()*6+1));
			zar2=((int) (Math.random()*6+1));
			System.out.println("Oyuncu2 oyuncusunun attýðý zar: "+zar1);
			System.out.println("Oyuncu2 oyuncusunun attýðý zar: "+zar2);
			
			if (zar2>zar1)
			{
				fark = zar2-zar1;
				oyuncu1-=fark;
				oyuncu2+=fark;
				System.out.println("Oyuncu2 oyuncusunun kalan parasý: "+zar1);
			}
			else if(zar2<zar1)
			{
				fark = zar1-zar2;
				oyuncu1+=fark;
				oyuncu2-=fark;
				System.out.println("Oyuncu1 oyuncusunun kalan parasý: "+zar2);
			}
			else
			{
				System.out.println("Lütfen tekrar zar atýn.");
			}
			if(oyuncu1<=0 || oyuncu2<=0)
			{
				break;
			}
			else
			{
				System.out.println();
				System.out.print("Tekrar zar atmak için t'ye basýnýz.");
				t=scanner.next().charAt(0);
			}
			
		}
		if(oyuncu1<=0)
		{
			System.out.println("Oyuncu2 "+sayac+" turda oyunu kazandý.");
		}
		else
		{
			System.out.println("Oyuncu1 "+sayac+" turda oyunu kazandý.");

		}
	}
}
