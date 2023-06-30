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
			int fatura_numarasý;
			String message="Merhaba muhasebeye hoþgeldiniz.\n"
					+ "Lütfen kayýt iþlemini tamamlamak için fatura numarasýný giriniz: ";
			System.out.print(message);
			fatura_numarasý=scanner.nextInt();
			if(fatura_numarasý==s.getFatura_no()) {
				System.out.println();
				System.out.println("Fatura numarasý kontrol ediliyor...");
				Thread.sleep(3000);
				String m="Kursun muhasebe biriminden sorumlu "+ad+" tarafýndan kontrol edildi"
						+ " ve doðru olduðu saptandý.\n"
						+ "Kursumuza hoþgeldiniz..^_^";
				System.out.println(m);
				return;
			}
			else {
				System.out.println();
				System.out.println("Fatura numarasý kontrol ediliyor...");
				Thread.sleep(3000);
				String mes="Kursun muhasebe biriminden sorumlu "+ad+" tarafýndan kontrol edildi"
						+ " ve yanlýþ olduðu saptandý.\n"
						+ "Lütfen fatura numarasýný tekrar giriniz.";
				System.out.println(mes);
				System.out.println("");
			}
		}
	}
}
