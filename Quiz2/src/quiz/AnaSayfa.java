package quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Isci> liste=new ArrayList<Isci>();
		
		String ad, soyad;
		int yas,cs;
		
		System.out.print("Eklenecek i��i say�s�n� giriniz: ");
		int sayi=scanner.nextInt();
		
		for(int i=0;i<sayi;i++)
		{
			System.out.print((i+1)+". i�cinin ad�: ");
			ad = scanner.next();
			System.out.print((i+1)+". i�cinin soyad�: ");
			soyad = scanner.next();
			System.out.print((i+1)+". i�cinin ya��: ");
			yas = scanner.nextInt();
			System.out.print((i+1)+". i�cinin �ocuk say�s�: ");
			cs = scanner.nextInt();
			Isci isci=new Isci(ad, soyad, yas, cs);
			liste.add(isci);
			System.out.println(" ");
		}
		
		System.out.println("***Listedeki ���iler***");
		for(Isci i:liste)
		{
			System.out.println(i.id+" "+i.ad+" "+i.soyad+" "+i.MaasHesapla()+" "+i.gorev);
		}
		
		File file=new File("isciler.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(Isci isci:liste)
		{
			bw.write(isci.id+" "+isci.ad+" "+isci.soyad+" "+isci.MaasHesapla()+"\n");
		}
		bw.close();
	}

}
