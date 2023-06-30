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
			System.out.println("1-��renci Ekle\n"
					+ "2-��rencileri Listele\n"
					+ "3-��renci Ara\n"
					+ "4-��renci Sil\n"
					+ "5-��k��\n"
					+ "1-5 Aras�nda bir se�im yap�n�z:");
			secim=scanner.nextInt();
			switch(secim)
			{
			case 1:
				System.out.println("��rencinin ad�n� giriniz: ");
				ad=scanner.next();
				System.out.println("��rencinin soyad�n� giriniz: ");
				soyad=scanner.next();
				System.out.println("��rencinin vize notunu giriniz: ");
				vn=scanner.nextInt();
				System.out.println("��rencinin final notunu giriniz: ");
				fn=scanner.nextInt();
				Ogrenci ogr=new Ogrenci(ad, soyad, vn, fn);
				liste.add(ogr);
				break;
			case 2:
				System.out.println("Listedeki ��renciler:");
				for(Ogrenci ogrenci:liste)
				{
					System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad()+" Ge�me Notu: "+ogrenci.getGecme_notu());
				}
				break;
			case 3:
				int count=0;
				String aranacak_ad;
				System.out.println("Listede aramak istedi�iniz ��rencinin ad�n� giriniz: ");
				aranacak_ad = scanner.next();
				for(Ogrenci ogrenci:liste)
				{
					if(aranacak_ad.equals(ogrenci.getAd()))
					{
						System.out.println("Aranan ��renci bulundu..");
						System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad()+" Ge�me Notu: "+ogrenci.getGecme_notu());						
						count++;
					}
				}
				if(count==0)
					System.out.println("Aranan ��renci bulunamad�...");
				break;
			case 4:
				String silinecek_ad;
				System.out.println("Listede silmek istedi�iniz ��rencinin ad�n� giriniz: ");
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
				System.out.println("��k�� yap�l�yor...");
				dongu=false;
				break;
			default:
				System.out.println("L�tfen 1-5 aras�nda se�im yap�n�z...");
				break;
			}
			
		}
		
	}

}
