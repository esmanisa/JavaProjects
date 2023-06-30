package sporMerkezi;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class AnaSayfa {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner scanner = new Scanner(System.in);

		String kursiyerAdSoyad=null, kursAd=null;
		int kursID = 0, kursiyerID = 0, kursiyerYas=0;
		boolean kontrol=true;
		int secim;
		String [] kursArray = null, kursiyerArray=null;
		Kursiyer _kursiyer1 = null;
		Kurs _kurs1 = null;
		
		ArrayList<Kurs> kurslar = new ArrayList<Kurs>();
		ArrayList<Kursiyer> kursiyerler = new ArrayList<Kursiyer>();

		String line, kursLine;
		File kurs=new File("kurs.txt");
		File kursiyer=new File("kursiyer.txt");
		
		
		if(kursiyer.exists())
		{
			BufferedReader brKursiyer=new BufferedReader(new FileReader("kursiyer.txt"));
			
			while((line = brKursiyer.readLine())!=null)
			{
				if(line.startsWith("#"))
				{
					line = line.replace("#", "");
					
					kursiyerArray = line.split("-");
					
					kursiyerID = Integer.parseInt(kursiyerArray[0]);
					
					kursiyerAdSoyad = kursiyerArray[1];
				
					kursiyerYas = Integer.parseInt(kursiyerArray[2]);
						
					
					_kursiyer1=new Kursiyer(kursiyerID, kursiyerAdSoyad, kursiyerYas);
					
					kursiyerler.add(_kursiyer1);
				}
				
				else
				{
					line = line.replace("*", "");
					kursArray = line.split("-");
							
					kursID = Integer.parseInt(kursArray[0]);
					kursAd = kursArray[1];
					
					_kurs1 = new Kurs(kursID, kursAd);
					
					_kursiyer1.alinanKurslar.add(_kurs1);	
				}
			}
			brKursiyer.close();
		}
		
		int sizeKrsyr = kursiyerler.size();
		int iter1=0, iter2=0;
		
		if(kurs.exists())
		{
			BufferedReader brKurs=new BufferedReader(new FileReader("kurs.txt"));
			
			while((kursLine = brKurs.readLine())!=null)
			{
				kursArray = kursLine.split("-");
				
				kursID = Integer.parseInt(kursArray[0]);
				kursAd = kursArray[1];
				_kurs1=new Kurs(kursID, kursAd);
				
				kurslar.add(_kurs1);
			}
			brKurs.close();
		}
		
		int sizeKrs = kurslar.size();
		
		String message	= "                     ***MENU***\n"
						+ "Kurs Eklemek i�in                              -> 1\n"
						+ "Kurs Listeleme i�in                            -> 2\n"
						+ "Kursiyer Eklemek i�in                          -> 3\n"
						+ "Kursiyer Aramak i�in                           -> 4\n"
						+ "Kursiyer Silmek i�in                           -> 5\n"
						+ "Kursiyerleri Listelemek i�in                   -> 6\n"
						+ "Kursiyerleri Ayr�nt�l� Listelemek i�in         -> 7\n"
			        	+ "Kursiyerlerin �deyece�i Tutar� Hesaplamak i�in -> 8\n"
          				+ "��k�� Yapmak i�in                              -> 9'u se�iniz.\n"
          				+ "Se�iminiz: ";
		
		int ks, krsySay, ks2;
		double ucret=100.0, toplam=0.0;
		
		while(kontrol)
		{
			int sayac_=0;
			System.out.print(message);
			secim = scanner.nextInt();
			System.out.println(" ");
			
			switch(secim)
			{
			case 1:
				System.out.print("Eklemek istedi�iniz kurs say�s�n� girin: ");
				ks = scanner.nextInt();
				for(int i=0;i<ks;i++)
				{
					System.out.print((i+1)+". kursun ID: ");
					kursID = scanner.nextInt();
					for(Kurs krs:kurslar)
					{
						if(kursID == krs.getKursID())
						{
							System.out.print("Bu ID'li ba�ka bir kurs bulunmaktad�r. \nL�tfen farkl� bir ID giriniz: ");
							kursID = scanner.nextInt();
							break;
						}
					}
					System.out.print(kursID+" ID'li kursun ad�: ");
					kursAd = scanner.next();
					
					System.out.println(" ");
					
					Kurs k=new Kurs(kursID, kursAd);
					kurslar.add(k);
				}
				System.out.println("\nKurs ekleme i�lemini ba�ar�yla tamamlad�n�z.\nTekrar ana men�ye d�n�yorsunuz..\n");
				Thread.sleep(2000);
				break;
			
			case 2:
				System.out.println("Kurs ID    Kurs Ad�");
				for(Kurs krs:kurslar)
				{
					System.out.println("  "+krs.getKursID()+"       "+krs.getKursAd());
				}
				System.out.println("\nTekrar ana men�ye d�n�yorsunuz..");
				System.out.println("");
				Thread.sleep(2000);
				break;
			
			case 3:
				System.out.print("Eklemek istedi�iniz kursiyer say�s�: ");
				krsySay = scanner.nextInt();
				System.out.println(" ");

				for(int i=0;i<krsySay;i++)
				{
					System.out.print((i+1)+". kursiyer ID: ");
					kursiyerID = scanner.nextInt();
					
					for(Kursiyer krs:kursiyerler)
					{
						if(kursiyerID == krs.getKursiyerID())
						{
							System.out.print("Bu ID'li ba�ka bir kursiyer bulunmaktad�r. \nL�tfen farkl� bir ID giriniz: ");
							kursiyerID = scanner.nextInt();
							break;
						}
					}
										
					System.out.print(kursiyerID+" ID'li kursiyerin ad� soyad�: ");
					scanner.nextLine();
					kursiyerAdSoyad = scanner.nextLine();
					
					System.out.print(kursiyerID+" ID'li kursiyerin ya��: ");
					kursiyerYas = scanner.nextInt();
					
					Kursiyer _kursiyer=new Kursiyer(kursiyerID, kursiyerAdSoyad, kursiyerYas);
					
					System.out.print(kursiyerID+" ID'li kursiyer ka� tane kursa kaydolacak: ");
					ks2=scanner.nextInt();

					System.out.println(" ");
					
					for(int j = 0;j<ks2;j++)
					{
						System.out.print(kursiyerID+" ID'li kursiyerin "+(j+1)+". kurs ID: ");
						kursID = scanner.nextInt();
						
						System.out.print(kursiyerID+" ID'li kursiyerin "+(j+1)+". kurs ad�: ");
						kursAd = scanner.next();
						System.out.println(" ");
						
						Kurs _kurs=new Kurs(kursID, kursAd);
						
						_kursiyer.alinanKurslar.add(_kurs);
					}
					kursiyerler.add(_kursiyer);
					System.out.println(" ");
				}
				System.out.println("\nKursiyer ekleme i�lemini ba�ar�yla tamamlad�n�z.\nTekrar ana men�ye d�n�yorsunuz...\n");
				Thread.sleep(2000);
				break;
				
			case 4:
				String aranan;
				scanner.nextLine();
				System.out.print("Aramak istedi�iniz kursiyerin ad� soyad�: ");

				aranan=scanner.nextLine();
								
				for(Kursiyer k:kursiyerler)
				{
					if(aranan.equals(k.getKursiyerAdSoyad()))
					{
						sayac_++;
						System.out.println(k.getKursiyerID()+" "+k.getKursiyerAdSoyad()+" "+k.getKursiyerYas());
						for(Kurs kr:k.alinanKurslar)
						{
							System.out.println(kr.getKursID()+" "+kr.getKursAd());
						}
					}
				}
				if(sayac_==0)
					System.out.println(aranan+" adl� bir kursiyer bulunamam��t�r...");
				
				System.out.println("\nTekrar ana men�ye y�nlendiriliyorsunuz...\n");
				Thread.sleep(2000);
				break;
				
			case 5:
				
				int silinecek;
				System.out.print("Silmek istedi�iniz kursiyerin ID: ");

				silinecek = scanner.nextInt();
				
				for(Kursiyer k:kursiyerler)
				{
					if(silinecek == k.getKursiyerID())
					{
						kursiyerler.remove(k);
						sayac_++;
					}
				}
				
				if(sayac_==0)
					System.out.println(silinecek+" adl� bir kursiyer bulunamam��t�r...");
				else
					System.out.println("Silme i�leminiz ba�ar� ile ger�ekle�ti..");
				
				System.out.println("\nTekrar ana men�ye y�nlendiriliyorsunuz..\n");
				Thread.sleep(2000);
				break;
				
			case 6:
				System.out.println("T�m Kursiyerler");
				System.out.println(" ");

				for(Kursiyer k:kursiyerler)
					System.out.println("     "+k.getKursiyerID()+" "+k.getKursiyerAdSoyad()+" "+k.getKursiyerYas());
				System.out.println("\nTekrar ana men�ye y�nlendiriliyorsunuz..\n");
				Thread.sleep(2000);
				break;
				
			case 7:
				System.out.println("T�m Kursiyerler ve Ald�klar� Kurslar");
				for(Kursiyer k:kursiyerler)
				{
					System.out.println(k.getKursiyerID()+" "+k.getKursiyerAdSoyad()+" "+k.getKursiyerYas());
					for(Kurs kr:k.alinanKurslar)
						System.out.println("     "+kr.getKursID()+" "+kr.getKursAd());
				}
				System.out.println("\nTekrar ana men�ye y�nlendiriliyorsunuz..\n");
				Thread.sleep(2000);
				break;
				
			case 8:
				System.out.print("�deyece�i tutar hesaplanacak kursiyer ID: ");
				kursiyerID = scanner.nextInt();
				for(Kursiyer k:kursiyerler)
				{
					if(k.getKursiyerID() == kursiyerID)
					{
						if (k.alinanKurslar.size() == 1)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Bir Kursa Kay�tl� Oldu�undan Kampanyalardan Faydalanmamaktad�r..");
							toplam = ucret*4;
							System.out.println(kursiyerID+" ID'li kursiyerin toplam �deyece�i tutar: "+toplam+" TL.");
						}
						else if(k.alinanKurslar.size() == 2)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Kampanya 1'den Faydalanmaktad�r.");
							toplam = (ucret*4)+((ucret*4)-(ucret*0.15));
							System.out.println("Kursiyerin toplam �deyece�i tutar: "+toplam+" TL.");
						}
						else if(k.alinanKurslar.size() == 3)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Kampanya 2'den Faydalanmaktad�r.");
							toplam = 2*(ucret*4) + ((ucret*4)-(ucret*0.25));
							System.out.println("Kursiyerin toplam �deyece�i tutar: "+toplam+" TL.");
						}
						else if (k.alinanKurslar.size() > 3)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Kampanya 3'den Faydalanmaktad�r.");
							int size=k.alinanKurslar.size();
							toplam = (size*(ucret*4) - size*(ucret*0.1));
							System.out.println("Kursiyerin toplam �deyece�i tutar: "+toplam+" TL.");
						}
						sayac_++;
					}
				}
				if (sayac_==0)
					System.out.println(kursiyerID+" ID'li kursiyer bulunamam��t�r...");
				System.out.println("\nTekrar ana men�ye y�nlendiriliyorsunuz..\n");
				Thread.sleep(2000);
				break;
				
			case 9:
				kontrol = false;
				scanner.close();

				if(!kurs.exists() && !kursiyer.exists())
				{
					kurs.createNewFile();
					kursiyer.createNewFile();
				}
				BufferedWriter bwKurs=new BufferedWriter(new FileWriter("kurs.txt"));
				BufferedWriter bwKursiyer=new BufferedWriter(new FileWriter("kursiyer.txt"));
				
				for(Kursiyer k:kursiyerler)
				{
					iter1++;
					if (iter1>sizeKrsyr)
					{
						bwKursiyer.write("#"+k.getKursiyerID()+"-"+k.getKursiyerAdSoyad()+"-"+k.getKursiyerYas()+"\n");
						for(Kurs kr:k.alinanKurslar)
						{
							bwKursiyer.write("*"+kr.getKursID()+"-"+kr.getKursAd()+"\n");
						}
					}
				}
				bwKursiyer.close();
				
				for(Kurs kr:kurslar)
				{
					iter2++;
					if(iter2>sizeKrs)
						bwKurs.write(kr.getKursID()+"-"+kr.getKursAd()+"\n");
				}
				bwKurs.close();
				
				System.out.println("��k�� yap�l�yor...");
				break;
				
			default:
				System.out.println("L�tfen (1-9) aras�nda se�im yap�n�z...");
				
			}
		}	
	}
}