package Course;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
	public static void main(String[] args)
	{
		short tahmin_hakki=6;
		String message="***Say� Tahmin Oyununa Ho�geldiniz***\n"
				+ "Oyunda tahmin edilecek say� 0 ile 20 aras�ndad�r.\n"
				+ "Tahmin hakk�n�z bitti�inde oyun sonlan�r.\n"
				+ "E�er isterseniz tekrar rastgele bir say� atayarak oyunu tekrar ba�latabilirsiniz.\n"
				+ "Oyun ba�lad�. Ba�ar�lar...\n"
				+ "Tahmin edilecek say�y� giriniz: ";
		while(true)
		{
			System.out.println(message);
			Random random=new Random();
			int tahmin_sayi=random.nextInt(20);
			Scanner scanner=new Scanner(System.in);
			for(int i=tahmin_hakki;i>0;i--)
			{
				int tahmin_edilecek_sayi=scanner.nextInt();
				if(tahmin_edilecek_sayi==tahmin_sayi)
				{
					String message2="Tebrikler say�y� do�ru tahmin ettiniz. \n"
							+ "Tekrar oynamak i�in->1 "
							+ "��kmak i�in->0'a bas�n�z...";
					System.out.println(message2);
					int cevap=scanner.nextInt();
					if(cevap==0)
					{
						System.out.println("��k�� yap�l�yor....");
						return;
					}
					else
					{
						break;
					}
				}
				else if(tahmin_sayi!=tahmin_edilecek_sayi)
				{
					System.out.println("Hatal� tahmin yapt�n�z.\nKalan tahmin hakk�n�z: "+(i-1));
					if(i==1)
					{
						String message3="Tahmin hakk�n�z bitti.\nTekrar oynamak i�in->1, ��kmak i�in->0'a bas�n�z..";
						System.out.println(message3);
						int cevap1=scanner.nextInt();
						if(cevap1==0)
						{
							System.out.println("��k�� yap�l�yor....");
							return;
						}
						else
						{
							break;
						}
					}
					tahminOrani(tahmin_sayi,tahmin_edilecek_sayi);
				}
			}
		}
	}
	static void tahminOrani(int tahmin_edilen_sayi, int tahmin_edilecek_sayi)
	{
		int f=tahmin_edilen_sayi-tahmin_edilecek_sayi;
		if(f<=0 && f>-2 || f>=0 && f<2)
		{
			System.out.println("Say�ya �ok yakla�t�n�z..");
		}
		else if(f<=-2 && f>-4 || f>=2 && f<4)
		{
			System.out.println("Say�ya yakla��yorsunuz..");
		}
		else if(f<=-4 && f>-14 || f>=15 && f<=19)
		{
			System.out.println("Say�dan uzakla��yorsunuz..");
		}
		else if(f<=-15 && f>=-19 || f>=15 && f<=19)		{
			System.out.println("Say�dan �ok uzakla�t�n�z..");
		}	
	}
}
