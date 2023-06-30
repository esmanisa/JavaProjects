package fonksiyon;

import java.util.Scanner;

// gi�e uygulamas�
public class Function {
	public static int toplamMaliyetHesapla(int toplamGecirilenDakika)
	{
		int havaalaniUcreti = 50;
		int dakikaMaliyeti = 2;
		return (toplamGecirilenDakika*dakikaMaliyeti+havaalaniUcreti);
	}
	
	public static int toplamMaliyetHesapla(int toplamGecirilenDakika, int otoparktaGecenS�re)
	{
		int havaalaniUcreti = 50;
		int dakikaMaliyeti = 2;
		int otoparkUcreti = 3;
		return (toplamGecirilenDakika*dakikaMaliyeti+otoparkUcreti*otoparktaGecenS�re+havaalaniUcreti);
	}
	public static void main(String [] args) throws InterruptedException
	{
		Scanner scanner=new Scanner(System.in);
		String message = "***Havaalan�m�za Ho�geldiniz***\n"
				+ "Havaalan� giri� �cret 50 TL'dir.\n"
				+ "Havaalan�na ara�s�z giri�ler A kap�s�ndan, ara�l� giri�ler B kap�s�ndand�r.\n"
				+ "Havaalan�nda ge�irdi�iniz her dakika �crete tabiisiniz.\n"
				+ "�cret ��k��ta �denecektir.\n"
				+ "Havaalan�nda ge�irdi�iniz her dakika i�in 2 TL �cret,\n"
				+ "otoparkta ge�irdi�iniz her dakika i�in 3 TL �cret al�n�r..";
		System.out.println(message);
		System.out.println();
		System.out.println();
		System.out.print("L�tfen kap�y� se�iniz: ");
		String kapiSecimi=scanner.nextLine();
		while(true)
		{
			if (kapiSecimi.equals("A"))
			{
				String m2 = "Havaaln�ndan ��k�� gi�esine ho�geldiniz.\n"
						+ "L�tfen havaal�nda ge�irdi�iniz toplam s�reyi giriniz(dk): ";
				System.out.print(m2);
				int toplamDakika = scanner.nextInt();
				System.out.println("Toplam �deme miktar�: "+toplamMaliyetHesapla(toplamDakika));
				System.out.println("�deme i�leminiz ger�ekle�iyor...");
				Thread.sleep(2000);
				System.out.println("�deme i�leminiz ba�ar� ile ger�ekle�ti...\n***�yi G�nler Dileriz***");
				return;
			}
			else if(kapiSecimi.equals("B"))
			{
				String m3 = "Havaaln�ndan ��k�� gi�esine ho�geldiniz.\n"
						+ "L�tfen havaal�nda ge�irdi�iniz toplam s�reyi giriniz(dk): ";
				System.out.print(m3);
				int toplamDakika = scanner.nextInt();
				System.out.print("Otoparkta ge�irdi�iniz toplam s�reyi girin:");
				int otoparktaGecenSure = scanner.nextInt();
				
				System.out.println("Toplam �deme miktar�: "+toplamMaliyetHesapla(toplamDakika,otoparktaGecenSure));
				System.out.println("�deme i�leminiz ger�ekle�iyor...");
				Thread.sleep(2000);
				System.out.println("�deme i�leminiz ba�ar� ile ger�ekle�ti...\n***�yi G�nler Dileriz***");
				return;
			}
			else
			{
				System.out.println("Ge�ersiz bir se�im yapt�n�z...");
				break;
			}
		}
	}
}
