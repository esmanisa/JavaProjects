package Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String cad, csoyad, coad;
		int cyas, coyas, syc, cs, id;
		
		ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
		
		System.out.println("�al��an say�s�n� giriniz: ");
		syc = scanner.nextInt();
		
		for(int i =0;i<syc;i++)
		{
			System.out.println((i+1)+". �al��an�n id: ");
			id = scanner.nextInt();
			System.out.println((i+1)+". �al��an�n ad�: ");
			cad = scanner.next();
			System.out.println((i+1)+". �al��an�n soyad�: ");
			csoyad = scanner.next();
			System.out.println((i+1)+". �al��an�n ya��: ");
			cyas = scanner.nextInt();
			
			Calisan calisan =new Calisan(id, cad, csoyad, cyas);
			
			System.out.println("�ocuk say�s�n� giriniz: ");
			cs = scanner.nextInt();
			
			for (int j=0;j<cs;j++)
			{
				System.out.println((i+1)+". �al��an�n "+(j+1)+". �ocu�unun ad�: ");
				cad = scanner.next();
				System.out.println((i+1)+". �al��an�n "+(j+1)+". �ocu�unun ya��: ");
				cyas = scanner.nextInt();
				
				Cocuk cocuk = new Cocuk(cad, cyas);
				
				calisan.cocuklar.add(cocuk);
			}
			calisanlar.add(calisan);
		}
		
		System.out.println("***T�m �al��an Bilgileri***");
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
