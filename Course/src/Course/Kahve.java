package Course;

import java.util.Scanner;

public class Kahve {
	public static void main(String[] args) throws InterruptedException
	{
		String kahve_cesitleri = "1) Dibek kahvesi\n"
				+ "2) Menengiç Kahvesi\n"
				+ "3) Çörekotu Kahvesi\n"
				+ "4) Adana Gar Kahvesi\n"
				+ "5) Sütlü Türk Kahvesi";
		System.out.println(kahve_cesitleri);
		System.out.print("Kaç numaralý kahveyi almak istersiniz: ");
		Scanner scanner=new Scanner(System.in);
		int kahve_secimi = scanner.nextInt();
		String seker="a)Þekersiz\n"
				+ "b)Az þekerli\n"
				+ "c)Orta þekerli\n"
				+ "d)Þekerli";
		System.out.println(seker);
		System.out.print("Kahvenizin þeker durumunu seçin: ");
		scanner.nextLine();
		String seker_sayisi = scanner.nextLine();
		String secim="";
		if(seker_sayisi.equals("a"))
		{
			secim = "Þekersiz";
		}
		else if(seker_sayisi.equals("b"))
		{
			secim = "Az þekerli";
		}
		else if(seker_sayisi.equals("c"))
		{
			secim = "Orta þekerli";
		}
		else if(seker_sayisi.equals("c"))
		{
			secim = "Þekerli";
		}
		else
		{
			System.out.println("Hatalý þeker seçimi yaptýnýz.");
		}
		switch(kahve_secimi)
		{
		case 1:
			System.out.println("Kahveniz hazýrlanýyor...");
			Thread.sleep(2000);
			String bildirim1 = secim+" dibek kahveniz hazýr.\nAfiyet olsun";
			System.out.println(bildirim1);
			break;
		case 2:
			System.out.println("Kahveniz hazýrlanýyor...");
			Thread.sleep(2000);
			String bildirim2 = secim+" menengiç kahveniz hazýr.\nAfiyet olsun";
			System.out.println(bildirim2);
			break;
		case 3:
			System.out.println("Kahveniz hazýrlanýyor...");
			Thread.sleep(2000);
			String bildirim3 = secim+" çörekotu kahveniz hazýr.\nAfiyet olsun";
			System.out.println(bildirim3);
			break;
		case 4:
			System.out.println("Kahveniz hazýrlanýyor...");
			Thread.sleep(2000);
			String bildirim4 = secim+" Adana gar kahveniz hazýr.\nAfiyet olsun";
			System.out.println(bildirim4);
			break;
		case 5:
			System.out.println("Kahveniz hazýrlanýyor...");
			Thread.sleep(2000);
			String bildirim5 = secim+" sütlü Türk kahveniz kahveniz hazýr.\nAfiyet olsun";
			System.out.println(bildirim5);
			break;
		default:
			System.out.println("Yanlýþ kahve seçimi...");
		}
		
	}
}
