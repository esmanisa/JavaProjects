package Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String cad, csoyad, coad;
		int cyas, coyas, syc, cs, id;
		
		ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
		
		System.out.println("Çalýþan sayýsýný giriniz: ");
		syc = scanner.nextInt();
		
		for(int i =0;i<syc;i++)
		{
			System.out.println((i+1)+". çalýþanýn id: ");
			id = scanner.nextInt();
			System.out.println((i+1)+". çalýþanýn adý: ");
			cad = scanner.next();
			System.out.println((i+1)+". çalýþanýn soyadý: ");
			csoyad = scanner.next();
			System.out.println((i+1)+". çalýþanýn yaþý: ");
			cyas = scanner.nextInt();
			
			Calisan calisan =new Calisan(id, cad, csoyad, cyas);
			
			System.out.println("Çocuk sayýsýný giriniz: ");
			cs = scanner.nextInt();
			
			for (int j=0;j<cs;j++)
			{
				System.out.println((i+1)+". çalýþanýn "+(j+1)+". çocuðunun adý: ");
				cad = scanner.next();
				System.out.println((i+1)+". çalýþanýn "+(j+1)+". çocuðunun yaþý: ");
				cyas = scanner.nextInt();
				
				Cocuk cocuk = new Cocuk(cad, cyas);
				
				calisan.cocuklar.add(cocuk);
			}
			calisanlar.add(calisan);
		}
		
		System.out.println("***Tüm Çalýþan Bilgileri***");
		for(Calisan clsn:calisanlar)
		{
			System.out.println(clsn.id+" "+clsn.ad+" "+clsn.soyad+" "+clsn.yas);
			for(Cocuk c:clsn.cocuklar)
			{
				System.out.println("\t"+c.ad+" "+c.yas);
			}
		}
	}

}
