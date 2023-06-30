package Projects;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmin {
	public static void main(String[] args) throws InterruptedException
	{
		Scanner scanner=new Scanner(System.in);
		HashMap<Integer, String>hMap=new HashMap<Integer, String>();
		
		hMap.put(1, "Adana");
		hMap.put(2, "Ad�yaman");
		hMap.put(3, "Afyonkarahisar");
		hMap.put(4, "A�r�");
		hMap.put(5, "Amasya");
		hMap.put(6, "Ankara");
		hMap.put(7, "Antalya");
		hMap.put(8, "Artvin");
		hMap.put(9, "Ayd�n");
		hMap.put(10, "Bal�kesir");
		hMap.put(11, "Bilecik");
		hMap.put(12, "Bing�l");
		hMap.put(13, "Bitlis");
		hMap.put(14, "Bolu");
		hMap.put(15, "Burdur");
		hMap.put(16, "Bursa");
		hMap.put(17, "�anakkale");
		hMap.put(18, "�ank�r�");
		hMap.put(19, "�orum");
		hMap.put(20, "Denizli");
		hMap.put(21, "Diyarbak�r");
		hMap.put(22, "Edirne");
		hMap.put(23, "Elaz��");
		hMap.put(24, "Erzincan");
		hMap.put(25, "Erzurum");
		hMap.put(26, "Eski�ehir");
		hMap.put(27, "Gaziantep");
		hMap.put(28, "Giresun");
		hMap.put(29, "G�m��hane");
		hMap.put(30, "Hakkari");
		hMap.put(31, "Hatay");
		hMap.put(32, "Isparta");
		hMap.put(33, "��el");
		hMap.put(34, "�stanbul");
		hMap.put(35, "�zmir");
		hMap.put(36, "Kars");
		hMap.put(37, "Kastamonu");
		hMap.put(38, "Kayseri");
		hMap.put(39, "K�rklareli");
		hMap.put(40, "K�r�ehir");
		
		int hak=3;
		
		String message="***�ehir Tahmin Oyununa Ho�geldiniz***\n"
				+ "Oyunda toplam 3 hakk�n�z bulunmaktad�r.\n"
				+ "Plaka kodlar� 1'den 40'a kadard�r.\n"
				+ "Oyun ba�lad�. Ba�ar�lar...";
		while(true)
		{
			System.out.println(" ");
			System.out.println(message);
			Random random=new Random();
			int plaka=1+random.nextInt(39);
			
			for(int i=hak;i>0;i--)
			{
				System.out.println(plaka+" hangi �ehrimizin plakas�d�r ?");
				String tahmin=scanner.nextLine();
				if(tahmin.equals(hMap.get(plaka)))
				{
					System.out.println(" ");
					String m="Tebrikler �ehri do�ru tahmin ettiniz.\n"
							+ "Tekrar oynamak i�in 1'e ��kmak i�in 0'a bas�n�z..";
					System.out.println(m);
					int cevap=scanner.nextInt();
					if(cevap == 0)
					{
						System.out.println(" ");
						System.out.println("��k�� yap�l�yor...");
						Thread.sleep(3000);
						return;
					}
					else
						break;
					
				}
				else if(!tahmin.equals(hMap.get(plaka)))
				{
					System.out.println(" ");
					System.out.println("Hatal� bir tahmin yapt�n�z yapt�n�z...\n"
							+ "Kalan tahmin hakk�="+(i-1));
					if(i==1)
					{
						System.out.println(" ");
						System.out.println("Tahmin hakk�n�z bitti...\n"
								+ "Tekrar oynamak i�in 1'e ��kmak i�in 0'a bas�n�z.\n");
						int cevap=scanner.nextInt();
						if(cevap==0)
						{
							System.out.println(" ");
							System.out.println("��k�� yap�l�yor...");
							Thread.sleep(3000);
							return;
						}
						else
							break;
					}
				}
			}
			
		}
	}
}
