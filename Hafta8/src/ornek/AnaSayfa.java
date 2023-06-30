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
			System.out.println(i+1+". muhendisin branþý: "+muhendisler[i].brans+" adý: "+muhendisler[i].ad+" yaþý: "+muhendisler[i].yas+" puaný: "+muhendisler[i].puanHesapla()); // puanHesapla metodunun çaðýrýlmasý geç baðlama, derleyici çalýþma anýnda karar veriyor.
	}
	
	public static void main(String[] args)
	{
		String ad;
		int yas, toplam, bs, es, ms;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Bilgisayar muhendisi sayýsý: ");
		bs = scanner.nextInt();
		System.out.print("Elektrik muhendisi sayýsý: ");
		es = scanner.nextInt();
		System.out.print("Makine muhendisi sayýsý: ");
		ms = scanner.nextInt();
		
		toplam = bs+es+ms;
		
		Muhendis[] muhendisler=new Muhendis[toplam];
		
		for(int i=0;i<bs;i++)
		{
			System.out.print(i+1+". bilgisayar muhendisinin adý: ");
			ad=scanner.next();
			System.out.print(i+1+". bilgisayar muhendisinin yaþý: ");
			yas = scanner.nextInt();
			muhendisler[i] = new BilgisayarMuhendisi(ad, yas);
		}
		System.out.println(" ");
		
		for(int i=bs; i<bs+es;i++)
		{
			System.out.print(i+1+". elektrik muhendisinin adý: ");
			ad=scanner.next();
			System.out.print(i+1+". elektrik muhendisinin yaþý: ");
			yas = scanner.nextInt();
			muhendisler[i] = new ElektrikMuhendisi(ad, yas);
		}
		System.out.println(" ");
		for(int i=bs+es;i<toplam;i++)
		{
			System.out.print(i+1+". makine muhendisinin adý: ");
			ad=scanner.next();
			System.out.print(i+1+". makine muhendisinin yaþý: ");
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
