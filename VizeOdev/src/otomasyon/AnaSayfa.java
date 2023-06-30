package otomasyon;

import java.util.Scanner;

public class AnaSayfa {
	public static void main(String[] args)
	{
		int depSay, perSay, serSay, depNo, perYas;
		String depAd, perAd, perSoyad, servisGuzergah;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Departman sayisini giriniz: ");
		depSay = scanner.nextInt(); System.out.println(" ");
		
		Departman[] departman=new Departman[depSay];
		
		for(int i=0;i<depSay;i++)
		{
			System.out.print((i+1)+". departmanýn departman numarasý: ");
			depNo = scanner.nextInt();
			System.out.print((i+1)+". departmanýn adý: ");
			depAd = scanner.next();
			System.out.println(" ");
			System.out.print(depAd+" departmanýnýn personel sayýsý: "); 
			perSay = scanner.nextInt(); System.out.println(" ");
			
			Personel[] personeller=new Personel[perSay];
			System.out.println("---"+depAd+" Departmanýnýn Personel Bilgilerini Giriniz---");
			for (int j=0;j<perSay;j++)
			{
				System.out.print((j+1)+". personelinin adý: ");
				perAd = scanner.next();
				System.out.print((j+1)+". personelinin soyadý: ");
				perSoyad = scanner.next();
				System.out.print((j+1)+". personelinin yaþý: ");
				perYas = scanner.nextInt();
				System.out.println(" ");
				personeller[j] = new Personel(depNo, perAd, perSoyad, perYas);
			}
			
			System.out.print(depAd+" departmanýnýn servis sayýsý: "); 
			serSay = scanner.nextInt(); System.out.println(" ");
			
			Servis[] servisler=new Servis[serSay];
			
			System.out.println("---"+depAd+" Departmanýnýn Servis Bilgilerini Giriniz---");

			for (int j=0;j<serSay;j++)
			{
				System.out.print((j+1)+". servisinin güzergahý: ");
				servisGuzergah = scanner.next();
				System.out.println(" ");
				
				servisler[j] = new Servis(depNo, servisGuzergah);
			}
			System.out.println(" ");
			departman[i] = new Departman(depNo, depAd, personeller, servisler);
		}
		System.out.println(" ");
		
		menuGoster(departman);
	}
	 
	public static void menuGoster(Departman[] departman)
	{
		Scanner scanner=new Scanner(System.in);
		String secim;
		while(true)
		{
			System.out.println("********MENU********");
			String message="*Tüm departman bilgilerini listelemek için         -> 1\n"
						 + "*Departman adýna göre arama yapmak için            -> 2\n"
						 + "*Personel adýna göre arama yapmak için             -> 3\n"
						 + "*Servis güzergahýna göre arama yapmak içn          -> 4\n"
						 + "*Yaþý en büyük/en küçük personel(leri) bulmak için -> 5\n"
						 + "*Çýkýþ için                                        -> 6\n"
						 + "*Seçiminiz: ";
			System.out.print(message);
			secim = scanner.next();
			
			switch(secim)
			{
			case "1":
				listele(departman);
				break;
			case "2":
				depAdArama(departman);
				break;
			case "3":
				perAdAramaYap(departman);
				break;
			case "4":
				serGuzAramaYap(departman);
				break;
			case "5":
				yasBul(departman);
				break;
			case "6":
				return;
			default:
				System.out.println("Hatalý seçim yaptýnýz, lütfen tekrar seçim yapýnýz...");
				System.out.println(" ");
			}
		}
	}
	
	private static void yasBul(Departman[] departman) {
		// en kucuk yastaki personeli bulmak için
		int indis1=0, indis2=0;
		int perYas=departman[indis1].personeller[indis2].getPerYas();
		
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].personeller.length;j++)
			{
				if(departman[i].personeller[j].getPerYas() < perYas)
				{
					perYas = departman[i].personeller[j].getPerYas();
					indis1=i;
					indis2=j;
				}
			}
		}
		System.out.println(" ");
		System.out.println("***Departmanlardaki En Küçük Personel(ler)in Bilgileri***");
		
		// eger ayný yasta olanlar varsa
		for(int i=0;i<departman.length;i++)
		{
			for(int k=0;k<departman[i].personeller.length;k++)
			{
				if(departman[indis1].personeller[indis2].getPerYas()==departman[i].personeller[k].getPerYas())
				{
					System.out.println("Departman No: "+departman[i].depNo+" Departman Ad: "+departman[i].depAd);
					System.out.println("Personel Bilgileri: "+departman[i].personeller[k].getPerID()+" "+departman[i].personeller[k].getPerAd()+" "+departman[i].personeller[k].getPerSoyad()+" "+departman[i].personeller[k].getPerYas());
					System.out.println(" ");
				}
			}
		}
		
		// en buyuk yastaki personeli bulmak için
		int indis3=0, indis4=0;
		int perYas1=departman[indis3].personeller[indis4].getPerYas();
		
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].personeller.length;j++)
			{
				if(departman[i].personeller[j].getPerYas()>perYas1)
				{
					perYas1 = departman[i].personeller[j].getPerYas();
					indis3=i;
					indis4=j;
				}
			}
		}
		System.out.println(" ");
		System.out.println("***Departmanlardaki En Büyük Personel(ler)in Bilgileri***");
		
		// eger ayný yasta olanlar varsa
		for(int i=0;i<departman.length;i++)
		{
			for(int k=0;k<departman[i].personeller.length;k++)
			{
				if(departman[indis3].personeller[indis4].getPerYas()==departman[i].personeller[k].getPerYas())
				{
					System.out.println("Departman No: "+departman[i].depNo+" Departman Ad: "+departman[i].depAd);
					System.out.println("Personel Bilgileri: "+departman[i].personeller[k].getPerID()+" "+departman[i].personeller[k].getPerAd()+" "+departman[i].personeller[k].getPerSoyad()+" "+departman[i].personeller[k].getPerYas());
					System.out.println(" ");
				}
			}
		}
	}

	private static void serGuzAramaYap(Departman[] departman) {
		String serGuz;
		int kontrol=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Arama yapmak istediðiniz servis güzergahýný giriniz: ");
		serGuz = scanner.nextLine();
		System.out.println(" ");
		
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].servisler.length;j++)
			{
				if(serGuz.equals(departman[i].servisler[j].getServisGuzergah()))
				{
					kontrol++;
					System.out.println("Departman: "+departman[i].depAd+" Servis ID: "+departman[i].servisler[j].getServisID()+" Güzergahý: "+departman[i].servisler[j].getServisGuzergah());
					System.out.println(" ");
				}
			}
		}
		if(kontrol==0)
		{
			System.out.println("Aradýðýnýz servis güzergahý bulunamamýþtýr...");
			System.out.println(" ");
		}
	}

	private static void perAdAramaYap(Departman[] departman) {
		String ad;
		int kontrol=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Arama yapmak istediðiniz personelin adýný giriniz: ");
		ad = scanner.nextLine();
		System.out.println(" ");
		
		for(int i=0;i<departman.length;i++)
		{
			for(int j=0;j<departman[i].personeller.length;j++)
			{
				if(ad.equals(departman[i].personeller[j].getPerAd()))
				{
					kontrol++;
					System.out.println(i+1+". Personelin Departmaný: "+departman[i].getDepAd()+" "+departman[i].personeller[j].getPerID()+" "+departman[i].personeller[j].getPerAd()+" "+departman[i].personeller[j].getPerSoyad()+" "+departman[i].personeller[j].getPerYas());
					System.out.println(" ");
				}
			}
		}
		if(kontrol==0)
		{
			System.out.println("Aradýðýnýz isimde personel bulunamamýþtýr...");
			System.out.println(" ");
		}
	}

	private static void listele(Departman[] departman) {
			for(int i=0;i<departman.length;i++)
			{
				System.out.println(" ");
				System.out.println("Departman No: "+departman[i].depNo+" Departman Adý: "+departman[i].depAd);
				System.out.println(" ");
				System.out.println("Personeller: ");
				for(int j=0;j<departman[i].personeller.length;j++)
				{
					System.out.println(j+1+". Personel: "+departman[i].personeller[j].getPerID()+" "+departman[i].personeller[j].getPerAd()+" "+departman[i].personeller[j].getPerSoyad()+" "+departman[i].personeller[j].getPerYas());
				}
				System.out.println(" ");
				System.out.println("Servisler: ");
				for(int k=0;k<departman[i].servisler.length;k++)
				{
					System.out.println(k+1+". Servis: "+departman[i].servisler[k].getServisID()+" "+departman[i].servisler[k].getServisGuzergah());
				}
			}
		}
	
	private static void depAdArama(Departman[] departman) {
		String depAd;
		int kontrol=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Arama yapmak istediðiniz departmanýn adýný giriniz: ");
		depAd = scanner.nextLine();
		System.out.println(" ");
		
		for(int i=0;i<departman.length;i++)
		{
			if(depAd.equals(departman[i].depAd))
			{
				kontrol++;
				System.out.println("Departman No: "+departman[i].depNo+" Departman Adý: "+departman[i].depAd);
				System.out.println(" ");
				System.out.println("Personeller: ");
				
				for(int j=0;j<departman[i].personeller.length;j++)
				{
					System.out.println(j+1+". Personel: "+departman[i].personeller[j].getPerID()+" "+departman[i].personeller[j].getPerAd()+" "+departman[i].personeller[j].getPerSoyad()+" "+departman[i].personeller[j].getPerYas());
				}
				System.out.println(" ");
				System.out.println("Servisler: ");
				
				for(int k=0;k<departman[i].servisler.length;k++)
				{
					System.out.println(k+1+". Servis: "+departman[i].servisler[k].getServisID()+" "+departman[i].servisler[k].getServisGuzergah());
					System.out.println(" ");
				}
			}
		}
		if(kontrol==0)
		{
			System.out.println("Aradýðýnýz isimde departman bulunamamýþtýr...");
			System.out.println(" ");
		}
	}
}
