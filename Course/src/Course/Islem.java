package Course;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args) throws InterruptedException
	{
		Sekreter s=new Sekreter("Nurgül");
		Scanner scanner=new Scanner(System.in);
		String giris="Kurs kayýt iþlemine hoþgeldiniz..\n"
				+ "Ben "+s.getAd()+"\n"
				+ "Java, Python ve C kurslarý olmak üzere üç kursumuz mevcuttur.\n"
				+ "Kurs ücretleri sabit olup 3000 TL'dir.\n"
				+ "Kursumuza kayýt olmanýz için kurs ücretini peþin olarak ödemeniz gerekmektedir.\n";
		System.out.println("*********************************");
		System.out.println(giris);
		System.out.println("*********************************");
		System.out.print("Lütfen kaydolmak istediðiniz kurs adýný giriniz: ");
		String kurs_adi=scanner.nextLine();
		System.out.print("Lütfen kursa kaydolmak için muhasebeye yatýracaðýnýz parayý giriniz: ");
		int yatirilacak_ucret=scanner.nextInt();
		if (yatirilacak_ucret==s.getUcret()) {
			System.out.println("");
			System.out.println("");
			s.islemSonucu();
			Muhasebe m=new Muhasebe("Mehmet");
			m.degerlendirme(s);
		}
		else {
			System.out.println("Ücretin tamamýný ödemediðiniz için baþvurunuz reddedildi...");
			return;
		}
	}
}
