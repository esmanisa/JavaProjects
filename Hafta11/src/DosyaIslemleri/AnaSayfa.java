package DosyaIslemleri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) throws IOException {

		ArrayList<Ogrenci> liste=new ArrayList<Ogrenci>();
		String ad,soyad;
		boolean dongu=true;
		Scanner scanner=new Scanner(System.in);
		int secim,no;
		
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
				System.out.println("Öðrencinin numarasýný giriniz: ");
				no=scanner.nextInt();
				Ogrenci ogr=new Ogrenci(ad, soyad, no);
				liste.add(ogr);
				break;
			case 2:
				System.out.println("Listedeki Öðrenciler:");
				for(Ogrenci ogrenci:liste)
				{
					System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad());
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
						System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad());						
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
				File file=new File("ogrenciler.txt");
				if(!file.exists())
				{
					file.createNewFile();
				}
				FileWriter fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				for(Ogrenci ogrenci:liste)
				{
					bw.write(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad()+"\n");
				}
				bw.close();
				break;
			default:
				System.out.println("Lütfen 1-5 arasýnda seçim yapýnýz...");
				break;
			}
			
		}
		
	}

}
