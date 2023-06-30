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
						+ "Kurs Eklemek için                              -> 1\n"
						+ "Kurs Listeleme için                            -> 2\n"
						+ "Kursiyer Eklemek için                          -> 3\n"
						+ "Kursiyer Aramak için                           -> 4\n"
						+ "Kursiyer Silmek için                           -> 5\n"
						+ "Kursiyerleri Listelemek için                   -> 6\n"
						+ "Kursiyerleri Ayrýntýlý Listelemek için         -> 7\n"
			        	+ "Kursiyerlerin Ödeyeceði Tutarý Hesaplamak için -> 8\n"
          				+ "Çýkýþ Yapmak için                              -> 9'u seçiniz.\n"
          				+ "Seçiminiz: ";
		
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
				System.out.print("Eklemek istediðiniz kurs sayýsýný girin: ");
				ks = scanner.nextInt();
				for(int i=0;i<ks;i++)
				{
					System.out.print((i+1)+". kursun ID: ");
					kursID = scanner.nextInt();
					for(Kurs krs:kurslar)
					{
						if(kursID == krs.getKursID())
						{
							System.out.print("Bu ID'li baþka bir kurs bulunmaktadýr. \nLütfen farklý bir ID giriniz: ");
							kursID = scanner.nextInt();
							break;
						}
					}
					System.out.print(kursID+" ID'li kursun adý: ");
					kursAd = scanner.next();
					
					System.out.println(" ");
					
					Kurs k=new Kurs(kursID, kursAd);
					kurslar.add(k);
				}
				System.out.println("\nKurs ekleme iþlemini baþarýyla tamamladýnýz.\nTekrar ana menüye dönüyorsunuz..\n");
				Thread.sleep(2000);
				break;
			
			case 2:
				System.out.println("Kurs ID    Kurs Adý");
				for(Kurs krs:kurslar)
				{
					System.out.println("  "+krs.getKursID()+"       "+krs.getKursAd());
				}
				System.out.println("\nTekrar ana menüye dönüyorsunuz..");
				System.out.println("");
				Thread.sleep(2000);
				break;
			
			case 3:
				System.out.print("Eklemek istediðiniz kursiyer sayýsý: ");
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
							System.out.print("Bu ID'li baþka bir kursiyer bulunmaktadýr. \nLütfen farklý bir ID giriniz: ");
							kursiyerID = scanner.nextInt();
							break;
						}
					}
										
					System.out.print(kursiyerID+" ID'li kursiyerin adý soyadý: ");
					scanner.nextLine();
					kursiyerAdSoyad = scanner.nextLine();
					
					System.out.print(kursiyerID+" ID'li kursiyerin yaþý: ");
					kursiyerYas = scanner.nextInt();
					
					Kursiyer _kursiyer=new Kursiyer(kursiyerID, kursiyerAdSoyad, kursiyerYas);
					
					System.out.print(kursiyerID+" ID'li kursiyer kaç tane kursa kaydolacak: ");
					ks2=scanner.nextInt();

					System.out.println(" ");
					
					for(int j = 0;j<ks2;j++)
					{
						System.out.print(kursiyerID+" ID'li kursiyerin "+(j+1)+". kurs ID: ");
						kursID = scanner.nextInt();
						
						System.out.print(kursiyerID+" ID'li kursiyerin "+(j+1)+". kurs adý: ");
						kursAd = scanner.next();
						System.out.println(" ");
						
						Kurs _kurs=new Kurs(kursID, kursAd);
						
						_kursiyer.alinanKurslar.add(_kurs);
					}
					kursiyerler.add(_kursiyer);
					System.out.println(" ");
				}
				System.out.println("\nKursiyer ekleme iþlemini baþarýyla tamamladýnýz.\nTekrar ana menüye dönüyorsunuz...\n");
				Thread.sleep(2000);
				break;
				
			case 4:
				String aranan;
				scanner.nextLine();
				System.out.print("Aramak istediðiniz kursiyerin adý soyadý: ");

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
					System.out.println(aranan+" adlý bir kursiyer bulunamamýþtýr...");
				
				System.out.println("\nTekrar ana menüye yönlendiriliyorsunuz...\n");
				Thread.sleep(2000);
				break;
				
			case 5:
				
				int silinecek;
				System.out.print("Silmek istediðiniz kursiyerin ID: ");

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
					System.out.println(silinecek+" adlý bir kursiyer bulunamamýþtýr...");
				else
					System.out.println("Silme iþleminiz baþarý ile gerçekleþti..");
				
				System.out.println("\nTekrar ana menüye yönlendiriliyorsunuz..\n");
				Thread.sleep(2000);
				break;
				
			case 6:
				System.out.println("Tüm Kursiyerler");
				System.out.println(" ");

				for(Kursiyer k:kursiyerler)
					System.out.println("     "+k.getKursiyerID()+" "+k.getKursiyerAdSoyad()+" "+k.getKursiyerYas());
				System.out.println("\nTekrar ana menüye yönlendiriliyorsunuz..\n");
				Thread.sleep(2000);
				break;
				
			case 7:
				System.out.println("Tüm Kursiyerler ve Aldýklarý Kurslar");
				for(Kursiyer k:kursiyerler)
				{
					System.out.println(k.getKursiyerID()+" "+k.getKursiyerAdSoyad()+" "+k.getKursiyerYas());
					for(Kurs kr:k.alinanKurslar)
						System.out.println("     "+kr.getKursID()+" "+kr.getKursAd());
				}
				System.out.println("\nTekrar ana menüye yönlendiriliyorsunuz..\n");
				Thread.sleep(2000);
				break;
				
			case 8:
				System.out.print("Ödeyeceði tutar hesaplanacak kursiyer ID: ");
				kursiyerID = scanner.nextInt();
				for(Kursiyer k:kursiyerler)
				{
					if(k.getKursiyerID() == kursiyerID)
					{
						if (k.alinanKurslar.size() == 1)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Bir Kursa Kayýtlý Olduðundan Kampanyalardan Faydalanmamaktadýr..");
							toplam = ucret*4;
							System.out.println(kursiyerID+" ID'li kursiyerin toplam ödeyeceði tutar: "+toplam+" TL.");
						}
						else if(k.alinanKurslar.size() == 2)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Kampanya 1'den Faydalanmaktadýr.");
							toplam = (ucret*4)+((ucret*4)-(ucret*0.15));
							System.out.println("Kursiyerin toplam ödeyeceði tutar: "+toplam+" TL.");
						}
						else if(k.alinanKurslar.size() == 3)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Kampanya 2'den Faydalanmaktadýr.");
							toplam = 2*(ucret*4) + ((ucret*4)-(ucret*0.25));
							System.out.println("Kursiyerin toplam ödeyeceði tutar: "+toplam+" TL.");
						}
						else if (k.alinanKurslar.size() > 3)
						{
							System.out.println(k.getKursiyerID()+" ID'li Kursiyer Kampanya 3'den Faydalanmaktadýr.");
							int size=k.alinanKurslar.size();
							toplam = (size*(ucret*4) - size*(ucret*0.1));
							System.out.println("Kursiyerin toplam ödeyeceði tutar: "+toplam+" TL.");
						}
						sayac_++;
					}
				}
				if (sayac_==0)
					System.out.println(kursiyerID+" ID'li kursiyer bulunamamýþtýr...");
				System.out.println("\nTekrar ana menüye yönlendiriliyorsunuz..\n");
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
				
				System.out.println("Çýkýþ yapýlýyor...");
				break;
				
			default:
				System.out.println("Lütfen (1-9) arasýnda seçim yapýnýz...");
				
			}
		}	
	}
}