package Course;

import java.util.Scanner;

public class ZarOyunu {
	public static void main(String[] args)
	{
		char t='t';
		int zar1,zar2=0,oyuncu1=0,oyuncu2=0, sayac=0, fark=0;
		Scanner scanner=new Scanner(System.in);
		String a="Birinci oyuncunun sahip oldu�u para miktar�: ";
		System.out.print(a);
		oyuncu1=scanner.nextInt();
		String b="�kinci oyuncunun sahip oldu�u para miktar�: ";
		System.out.print(b);
		oyuncu2=scanner.nextInt();
		
		while(oyuncu1>0 && oyuncu2>0 && t=='t')
		{
			sayac++;
			System.out.println("�u anda oyunun "+sayac+". turundas�n�z.");
			zar1=((int) (Math.random()*6+1));
			zar2=((int) (Math.random()*6+1));
			System.out.println("Oyuncu2 oyuncusunun att��� zar: "+zar1);
			System.out.println("Oyuncu2 oyuncusunun att��� zar: "+zar2);
			
			if (zar2>zar1)
			{
				fark = zar2-zar1;
				oyuncu1-=fark;
				oyuncu2+=fark;
				System.out.println("Oyuncu2 oyuncusunun kalan paras�: "+zar1);
			}
			else if(zar2<zar1)
			{
				fark = zar1-zar2;
				oyuncu1+=fark;
				oyuncu2-=fark;
				System.out.println("Oyuncu1 oyuncusunun kalan paras�: "+zar2);
			}
			else
			{
				System.out.println("L�tfen tekrar zar at�n.");
			}
			if(oyuncu1<=0 || oyuncu2<=0)
			{
				break;
			}
			else
			{
				System.out.println();
				System.out.print("Tekrar zar atmak i�in t'ye bas�n�z.");
				t=scanner.next().charAt(0);
			}
			
		}
		if(oyuncu1<=0)
		{
			System.out.println("Oyuncu2 "+sayac+" turda oyunu kazand�.");
		}
		else
		{
			System.out.println("Oyuncu1 "+sayac+" turda oyunu kazand�.");

		}
	}
}
