package dahiliSýnýf;

import java.util.Scanner;

public class Calistir {
	public static void main(String args) throws InterruptedException
	{
		String message="Eðitim kurumumuzun iþ baþvurusuna hoþgeldiniz.\n"
				+ "Ýlk olarak matematik öðretmenleri mülakata alýnacaktýr.\n"
				+ "Aþaðýdaki sorulan sorularý sýrasýyla cevaplayýn.\n"
				+ "1-) Kaç yaþýndasýnýz: ";
		System.out.print(message);
		Scanner s=new Scanner(System.in);
		int yasA = s.nextInt();
		MatematikOgretmeni m=new MatematikOgretmeni();
		m.yas(yasA);
		String message2="2-) Kaç yýldýr eðitim sektöründesiniz: ";
		System.out.print(message2);
		int yilA=s.nextInt();
		m.egitim_tecrübe(yilA);
		String message3="3-) Medeni durumunuz: ";
		System.out.print(message3);
		String durum=s.nextLine();
		m.medeni_hal(durum);
		
		Thread.sleep(2000);
		
		System.out.println("-------------------------------------------------------");
		
		String message4="Rehberlik danýþmaný mülakatýmýz baþlamýþtýr.\n"
				+ "Aþaðýdaki sorulan sorularý sýrasýyla cevaplayýn.\n"
				+ "1-) En son nerede çalýþtýnýz (Çzel Kurum/Devlet Kurumu): ";
		System.out.print(message4);
		RehberlikOgretmeni r=new RehberlikOgretmeni();
		String cevap=s.nextLine();
		r.son_calistigi_kurum(cevap);
		
		String mess="2-) Kaç yaþýndasýnýz: ";
		System.out.println(mess);
		int cevap2 = s.nextInt();
		r.yas(cevap2);
		
		String messa="3-) Kaç yýldýr eðitim sektöründesiniz: ";
		System.out.print(messa);
		int yilB=s.nextInt();
		m.egitim_tecrübe(yilB);
		
		String messag="4-) Medeni durumunuz: ";
		System.out.print(messag);
		String durum1=s.nextLine();
		m.medeni_hal(durum1);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Matematik öðretmeni mülakat sonuçlarý deðerlendiriliyor...");
		Thread.sleep(2000);
		
		if (yasA<40 && yilA>=3 && durum.equals("Bekar"))
		{
			System.out.println("Matematik öðretmeni mülakatý baþarý ile sonuçlanmýþtýr...");
		}
		else
		{
			System.out.println("Þartlar saðlanmasýðý için maalesef mülakatý geçemediniz...");
		}
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Rehberlik öðretmeni mülakat sonuçlarý deðerlendiriliyor...");
		Thread.sleep(2000);
		
		if (cevap.equals("Devlet kurumu") && cevap2<50 && yilB>=3 && !durum1.equals(null))
		{
			System.out.println("Rehberlik öðretmeni mülakatý baþarý ile sonuçlanmýþtýr...");
		}
		else
		{
			System.out.println("Þartlar saðlanmasýðý için maalesef mülakatý geçemediniz...");
		}
		return;
	}
}
