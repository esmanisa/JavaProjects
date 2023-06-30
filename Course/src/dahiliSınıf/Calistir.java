package dahiliS�n�f;

import java.util.Scanner;

public class Calistir {
	public static void main(String args) throws InterruptedException
	{
		String message="E�itim kurumumuzun i� ba�vurusuna ho�geldiniz.\n"
				+ "�lk olarak matematik ��retmenleri m�lakata al�nacakt�r.\n"
				+ "A�a��daki sorulan sorular� s�ras�yla cevaplay�n.\n"
				+ "1-) Ka� ya��ndas�n�z: ";
		System.out.print(message);
		Scanner s=new Scanner(System.in);
		int yasA = s.nextInt();
		MatematikOgretmeni m=new MatematikOgretmeni();
		m.yas(yasA);
		String message2="2-) Ka� y�ld�r e�itim sekt�r�ndesiniz: ";
		System.out.print(message2);
		int yilA=s.nextInt();
		m.egitim_tecr�be(yilA);
		String message3="3-) Medeni durumunuz: ";
		System.out.print(message3);
		String durum=s.nextLine();
		m.medeni_hal(durum);
		
		Thread.sleep(2000);
		
		System.out.println("-------------------------------------------------------");
		
		String message4="Rehberlik dan��man� m�lakat�m�z ba�lam��t�r.\n"
				+ "A�a��daki sorulan sorular� s�ras�yla cevaplay�n.\n"
				+ "1-) En son nerede �al��t�n�z (�zel Kurum/Devlet Kurumu): ";
		System.out.print(message4);
		RehberlikOgretmeni r=new RehberlikOgretmeni();
		String cevap=s.nextLine();
		r.son_calistigi_kurum(cevap);
		
		String mess="2-) Ka� ya��ndas�n�z: ";
		System.out.println(mess);
		int cevap2 = s.nextInt();
		r.yas(cevap2);
		
		String messa="3-) Ka� y�ld�r e�itim sekt�r�ndesiniz: ";
		System.out.print(messa);
		int yilB=s.nextInt();
		m.egitim_tecr�be(yilB);
		
		String messag="4-) Medeni durumunuz: ";
		System.out.print(messag);
		String durum1=s.nextLine();
		m.medeni_hal(durum1);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Matematik ��retmeni m�lakat sonu�lar� de�erlendiriliyor...");
		Thread.sleep(2000);
		
		if (yasA<40 && yilA>=3 && durum.equals("Bekar"))
		{
			System.out.println("Matematik ��retmeni m�lakat� ba�ar� ile sonu�lanm��t�r...");
		}
		else
		{
			System.out.println("�artlar sa�lanmas��� i�in maalesef m�lakat� ge�emediniz...");
		}
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Rehberlik ��retmeni m�lakat sonu�lar� de�erlendiriliyor...");
		Thread.sleep(2000);
		
		if (cevap.equals("Devlet kurumu") && cevap2<50 && yilB>=3 && !durum1.equals(null))
		{
			System.out.println("Rehberlik ��retmeni m�lakat� ba�ar� ile sonu�lanm��t�r...");
		}
		else
		{
			System.out.println("�artlar sa�lanmas��� i�in maalesef m�lakat� ge�emediniz...");
		}
		return;
	}
}
