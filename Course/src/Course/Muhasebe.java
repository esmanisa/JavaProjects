package Course;

import java.util.Scanner;

public class Muhasebe {
	private String ad;
	
	public Muhasebe(String ad) {
		this.ad = ad;
	}
	
	public void degerlendirme(Sekreter s) throws InterruptedException {
		while (true) {
			Scanner scanner=new Scanner(System.in);
			int fatura_numaras�;
			String message="Merhaba muhasebeye ho�geldiniz.\n"
					+ "L�tfen kay�t i�lemini tamamlamak i�in fatura numaras�n� giriniz: ";
			System.out.print(message);
			fatura_numaras�=scanner.nextInt();
			if(fatura_numaras�==s.getFatura_no()) {
				System.out.println();
				System.out.println("Fatura numaras� kontrol ediliyor...");
				Thread.sleep(3000);
				String m="Kursun muhasebe biriminden sorumlu "+ad+" taraf�ndan kontrol edildi"
						+ " ve do�ru oldu�u saptand�.\n"
						+ "Kursumuza ho�geldiniz..^_^";
				System.out.println(m);
				return;
			}
			else {
				System.out.println();
				System.out.println("Fatura numaras� kontrol ediliyor...");
				Thread.sleep(3000);
				String mes="Kursun muhasebe biriminden sorumlu "+ad+" taraf�ndan kontrol edildi"
						+ " ve yanl�� oldu�u saptand�.\n"
						+ "L�tfen fatura numaras�n� tekrar giriniz.";
				System.out.println(mes);
				System.out.println("");
			}
		}
	}
}
