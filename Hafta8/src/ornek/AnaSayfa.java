package ornek;

import java.util.Scanner;

public class AnaSayfa {
	
	public static void bilgileriListele(Muhendis muhendis)
	{
		System.out.println(" ");
		muhendis.bilgileriYazdir();
	}
	
	public static void puanlariYazdir(Muhendis[] muhendisler)
	{
		System.out.println(" ");
		for(int i=0;i<muhendisler.length;i++)
			System.out.println(i+1+". muhendisin bran��: "+muhendisler[i].brans+" ad�: "+muhendisler[i].ad+" ya��: "+muhendisler[i].yas+" puan�: "+muhendisler[i].puanHesapla()); // puanHesapla metodunun �a��r�lmas� ge� ba�lama, derleyici �al��ma an�nda karar veriyor.
	}
	
	public static void main(String[] args)
	{
		String ad;
		int yas, toplam, bs, es, ms;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Bilgisayar muhendisi say�s�: ");
		bs = scanner.nextInt();
		System.out.print("Elektrik muhendisi say�s�: ");
		es = scanner.nextInt();
		System.out.print("Makine muhendisi say�s�: ");
		ms = scanner.nextInt();
		
		toplam = bs+es+ms;
		
		Muhendis[] muhendisler=new Muhendis[toplam];
		
		for(int i=0;i<bs;i++)
		{
			System.out.print(i+1+". bilgisayar muhendisinin ad�: ");
			ad=scanner.next();
			System.out.print(i+1+". bilgisayar muhendisinin ya��: ");
			yas = scanner.nextInt();
			muhendisler[i] = new BilgisayarMuhendisi(ad, yas);
		}
		System.out.println(" ");
		
		for(int i=bs; i<bs+es;i++)
		{
			System.out.print(i+1+". elektrik muhendisinin ad�: ");
			ad=scanner.next();
			System.out.print(i+1+". elektrik muhendisinin ya��: ");
			yas = scanner.nextInt();
			muhendisler[i] = new ElektrikMuhendisi(ad, yas);
		}
		System.out.println(" ");
		for(int i=bs+es;i<toplam;i++)
		{
			System.out.print(i+1+". makine muhendisinin ad�: ");
			ad=scanner.next();
			System.out.print(i+1+". makine muhendisinin ya��: ");
			yas = scanner.nextInt();
			muhendisler[i] = new MakineMuhendisi(ad, yas);
		}
		System.out.println(" ");
		
		for(int i=0;i<toplam;i++)
		{
			bilgileriListele(muhendisler[i]);
		}
		
		puanlariYazdir(muhendisler);
	}
}
