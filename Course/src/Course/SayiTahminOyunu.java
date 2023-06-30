package Course;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
	public static void main(String[] args)
	{
		short tahmin_hakki=6;
		String message="***Sayı Tahmin Oyununa Hoşgeldiniz***\n"
				+ "Oyunda tahmin edilecek sayı 0 ile 20 arasındadır.\n"
				+ "Tahmin hakkınız bittiğinde oyun sonlanır.\n"
				+ "Eğer isterseniz tekrar rastgele bir sayı atayarak oyunu tekrar başlatabilirsiniz.\n"
				+ "Oyun başladı. Başarılar...\n"
				+ "Tahmin edilecek sayıyı giriniz: ";
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
					String message2="Tebrikler sayıyı doğru tahmin ettiniz. \n"
							+ "Tekrar oynamak için->1 "
							+ "Çıkmak için->0'a basınız...";
					System.out.println(message2);
					int cevap=scanner.nextInt();
					if(cevap==0)
					{
						System.out.println("Çıkış yapılıyor....");
						return;
					}
					else
					{
						break;
					}
				}
				else if(tahmin_sayi!=tahmin_edilecek_sayi)
				{
					System.out.println("Hatalı tahmin yaptınız.\nKalan tahmin hakkınız: "+(i-1));
					if(i==1)
					{
						String message3="Tahmin hakkınız bitti.\nTekrar oynamak için->1, Çıkmak için->0'a basınız..";
						System.out.println(message3);
						int cevap1=scanner.nextInt();
						if(cevap1==0)
						{
							System.out.println("Çıkış yapılıyor....");
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
			System.out.println("Sayıya çok yaklaştınız..");
		}
		else if(f<=-2 && f>-4 || f>=2 && f<4)
		{
			System.out.println("Sayıya yaklaşıyorsunuz..");
		}
		else if(f<=-4 && f>-14 || f>=15 && f<=19)
		{
			System.out.println("Sayıdan uzaklaşıyorsunuz..");
		}
		else if(f<=-15 && f>=-19 || f>=15 && f<=19)		{
			System.out.println("Sayıdan çok uzaklaştınız..");
		}	
	}
}
