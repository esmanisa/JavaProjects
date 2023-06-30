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
				System.out.println("��rencinin numaras�n� giriniz: ");
				no=scanner.nextInt();
				Ogrenci ogr=new Ogrenci(ad, soyad, no);
				liste.add(ogr);
				break;
			case 2:
				System.out.println("Listedeki ��renciler:");
				for(Ogrenci ogrenci:liste)
				{
					System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad());
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
						System.out.println(ogrenci.getNo()+" "+ogrenci.getAd()+" "+ogrenci.getSoyad());						
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
				System.out.println("L�tfen 1-5 aras�nda se�im yap�n�z...");
				break;
			}
			
		}
		
	}

}
