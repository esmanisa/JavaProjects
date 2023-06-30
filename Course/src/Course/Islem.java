package Course;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args) throws InterruptedException
	{
		Sekreter s=new Sekreter("Nurg�l");
		Scanner scanner=new Scanner(System.in);
		String giris="Kurs kay�t i�lemine ho�geldiniz..\n"
				+ "Ben "+s.getAd()+"\n"
				+ "Java, Python ve C kurslar� olmak �zere �� kursumuz mevcuttur.\n"
				+ "Kurs �cretleri sabit olup 3000 TL'dir.\n"
				+ "Kursumuza kay�t olman�z i�in kurs �cretini pe�in olarak �demeniz gerekmektedir.\n";
		System.out.println("*********************************");
		System.out.println(giris);
		System.out.println("*********************************");
		System.out.print("L�tfen kaydolmak istedi�iniz kurs ad�n� giriniz: ");
		String kurs_adi=scanner.nextLine();
		System.out.print("L�tfen kursa kaydolmak i�in muhasebeye yat�raca��n�z paray� giriniz: ");
		int yatirilacak_ucret=scanner.nextInt();
		if (yatirilacak_ucret==s.getUcret()) {
			System.out.println("");
			System.out.println("");
			s.islemSonucu();
			Muhasebe m=new Muhasebe("Mehmet");
			m.degerlendirme(s);
		}
		else {
			System.out.println("�cretin tamam�n� �demedi�iniz i�in ba�vurunuz reddedildi...");
			return;
		}
	}
}
