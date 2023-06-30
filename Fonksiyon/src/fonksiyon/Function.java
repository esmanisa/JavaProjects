package fonksiyon;

import java.util.Scanner;

// giþe uygulamasý
public class Function {
	public static int toplamMaliyetHesapla(int toplamGecirilenDakika)
	{
		int havaalaniUcreti = 50;
		int dakikaMaliyeti = 2;
		return (toplamGecirilenDakika*dakikaMaliyeti+havaalaniUcreti);
	}
	
	public static int toplamMaliyetHesapla(int toplamGecirilenDakika, int otoparktaGecenSüre)
	{
		int havaalaniUcreti = 50;
		int dakikaMaliyeti = 2;
		int otoparkUcreti = 3;
		return (toplamGecirilenDakika*dakikaMaliyeti+otoparkUcreti*otoparktaGecenSüre+havaalaniUcreti);
	}
	public static void main(String [] args) throws InterruptedException
	{
		Scanner scanner=new Scanner(System.in);
		String message = "***Havaalanýmýza Hoþgeldiniz***\n"
				+ "Havaalaný giriþ ücret 50 TL'dir.\n"
				+ "Havaalanýna araçsýz giriþler A kapýsýndan, araçlý giriþler B kapýsýndandýr.\n"
				+ "Havaalanýnda geçirdiðiniz her dakika ücrete tabiisiniz.\n"
				+ "Ücret çýkýþta ödenecektir.\n"
				+ "Havaalanýnda geçirdiðiniz her dakika için 2 TL ücret,\n"
				+ "otoparkta geçirdiðiniz her dakika için 3 TL ücret alýnýr..";
		System.out.println(message);
		System.out.println();
		System.out.println();
		System.out.print("Lütfen kapýyý seçiniz: ");
		String kapiSecimi=scanner.nextLine();
		while(true)
		{
			if (kapiSecimi.equals("A"))
			{
				String m2 = "Havaalnýndan çýkýþ giþesine hoþgeldiniz.\n"
						+ "Lütfen havaalýnda geçirdiðiniz toplam süreyi giriniz(dk): ";
				System.out.print(m2);
				int toplamDakika = scanner.nextInt();
				System.out.println("Toplam ödeme miktarý: "+toplamMaliyetHesapla(toplamDakika));
				System.out.println("Ödeme iþleminiz gerçekleþiyor...");
				Thread.sleep(2000);
				System.out.println("Ödeme iþleminiz baþarý ile gerçekleþti...\n***Ýyi Günler Dileriz***");
				return;
			}
			else if(kapiSecimi.equals("B"))
			{
				String m3 = "Havaalnýndan çýkýþ giþesine hoþgeldiniz.\n"
						+ "Lütfen havaalýnda geçirdiðiniz toplam süreyi giriniz(dk): ";
				System.out.print(m3);
				int toplamDakika = scanner.nextInt();
				System.out.print("Otoparkta geçirdiðiniz toplam süreyi girin:");
				int otoparktaGecenSure = scanner.nextInt();
				
				System.out.println("Toplam ödeme miktarý: "+toplamMaliyetHesapla(toplamDakika,otoparktaGecenSure));
				System.out.println("Ödeme iþleminiz gerçekleþiyor...");
				Thread.sleep(2000);
				System.out.println("Ödeme iþleminiz baþarý ile gerçekleþti...\n***Ýyi Günler Dileriz***");
				return;
			}
			else
			{
				System.out.println("Geçersiz bir seçim yaptýnýz...");
				break;
			}
		}
	}
}
