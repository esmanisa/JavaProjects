package Course;

import java.util.Scanner;

public class Kahve {
	public static void main(String[] args) throws InterruptedException
	{
		String kahve_cesitleri = "1) Dibek kahvesi\n"
				+ "2) Menengi� Kahvesi\n"
				+ "3) ��rekotu Kahvesi\n"
				+ "4) Adana Gar Kahvesi\n"
				+ "5) S�tl� T�rk Kahvesi";
		System.out.println(kahve_cesitleri);
		System.out.print("Ka� numaral� kahveyi almak istersiniz: ");
		Scanner scanner=new Scanner(System.in);
		int kahve_secimi = scanner.nextInt();
		String seker="a)�ekersiz\n"
				+ "b)Az �ekerli\n"
				+ "c)Orta �ekerli\n"
				+ "d)�ekerli";
		System.out.println(seker);
		System.out.print("Kahvenizin �eker durumunu se�in: ");
		scanner.nextLine();
		String seker_sayisi = scanner.nextLine();
		String secim="";
		if(seker_sayisi.equals("a"))
		{
			secim = "�ekersiz";
		}
		else if(seker_sayisi.equals("b"))
		{
			secim = "Az �ekerli";
		}
		else if(seker_sayisi.equals("c"))
		{
			secim = "Orta �ekerli";
		}
		else if(seker_sayisi.equals("c"))
		{
			secim = "�ekerli";
		}
		else
		{
			System.out.println("Hatal� �eker se�imi yapt�n�z.");
		}
		switch(kahve_secimi)
		{
		case 1:
			System.out.println("Kahveniz haz�rlan�yor...");
			Thread.sleep(2000);
			String bildirim1 = secim+" dibek kahveniz haz�r.\nAfiyet olsun";
			System.out.println(bildirim1);
			break;
		case 2:
			System.out.println("Kahveniz haz�rlan�yor...");
			Thread.sleep(2000);
			String bildirim2 = secim+" menengi� kahveniz haz�r.\nAfiyet olsun";
			System.out.println(bildirim2);
			break;
		case 3:
			System.out.println("Kahveniz haz�rlan�yor...");
			Thread.sleep(2000);
			String bildirim3 = secim+" ��rekotu kahveniz haz�r.\nAfiyet olsun";
			System.out.println(bildirim3);
			break;
		case 4:
			System.out.println("Kahveniz haz�rlan�yor...");
			Thread.sleep(2000);
			String bildirim4 = secim+" Adana gar kahveniz haz�r.\nAfiyet olsun";
			System.out.println(bildirim4);
			break;
		case 5:
			System.out.println("Kahveniz haz�rlan�yor...");
			Thread.sleep(2000);
			String bildirim5 = secim+" s�tl� T�rk kahveniz kahveniz haz�r.\nAfiyet olsun";
			System.out.println(bildirim5);
			break;
		default:
			System.out.println("Yanl�� kahve se�imi...");
		}
		
	}
}
