package ExampleArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		
		ArrayList<Ogrenci> liste=new ArrayList<Ogrenci>();
		String ad,soyad;
		boolean dongu=true;
		Scanner scanner=new Scanner(System.in);
		int secim,vn,fn;
		
		while(dongu)
		{
			System.out.println("1-Öðrenci Ekle\n"
					+ "2-Öðrencileri Listele\n"
					+ "3-Öðrenci Ara\n"
					+ "4-Öðrenci Sil\n"
					+ "5-Çýkýþ\n"
					+ "1-5 Arasýnda bir seçim yapýnýz:");
			secim=scanner.nextInt();
			switch(secim)
			{
			case 1:
				System.out.println("Öðrencinin adýný giriniz: ");
				ad=scanner.next();
				System.out.println("Öðrencinin soyadýný giriniz: ");
				soyad=scanner.next();
				System.out.println("Öðrencinin vize notunu giriniz: ");
				vn=scanner.nextInt();
				System.out.println("Öðrencinin final notunu giriniz: ");
				fn=scanner.nextInt();
				Ogrenci ogr=new Ogrenci(ad, soyad, vn, fn);
				liste.add(ogr);
				break;
			case 2:
				System.out.println("Listedeki Öðrenciler:");
				for(Ogrenci ogrenci:liste)
				{
					System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad()+" Geçme Notu: "+ogrenci.getGecme_notu());
				}
				break;
			case 3:
				int count=0;
				String aranacak_ad;
				System.out.println("Listede aramak istediðiniz öðrencinin adýný giriniz: ");
				aranacak_ad = scanner.next();
				for(Ogrenci ogrenci:liste)
				{
					if(aranacak_ad.equals(ogrenci.getAd()))
					{
						System.out.println("Aranan öðrenci bulundu..");
						System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad()+" Geçme Notu: "+ogrenci.getGecme_notu());						
						count++;
					}
				}
				if(count==0)
					System.out.println("Aranan öðrenci bulunamadý...");
				break;
			case 4:
				String silinecek_ad;
				System.out.println("Listede silmek istediðiniz öðrencinin adýný giriniz: ");
				silinecek_ad = scanner.next();
				for(Ogrenci ogrenci:liste)
				{
					if(silinecek_ad.equals(ogrenci.getAd()))
					{
						liste.remove(ogrenci);
					}
				}
				break;
			case 5:
				System.out.println("Çýkýþ yapýlýyor...");
				dongu=false;
				break;
			default:
				System.out.println("Lütfen 1-5 arasýnda seçim yapýnýz...");
				break;
			}
			
		}
		
	}

}
