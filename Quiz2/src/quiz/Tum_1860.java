package quiz;

public class Tum_1860 {

}
public abstract class Calisan {
	public int id;
	public String ad;
	public String soyad;
	public int yas;
	public int cs;
	private static int count=1000;
	
	public Calisan(String ad, String soyad, int yas, int cs) {
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.cs = cs;
		this.id = count+2;
	}
	
	public abstract double  ZamOraniHesapla();
}
public class Isci extends Calisan implements Maas{

	public String gorev;
	
	public Isci(String ad, String soyad, int yas, int cs) {
		super(ad, soyad, yas, cs);
		this.gorev = "Ýþçi";
	}
	
	@Override
	public double ZamOraniHesapla() {
		double zam_oran = ((cs*100) + (2*this.yas)/3);
		return zam_oran;
	}

	
	@Override
	public double MaasHesapla() {
		double zam_oraný=ZamOraniHesapla();
		double maas = 3000 + zam_oraný;
		return maas;
	}
}
public interface Maas {
	public double MaasHesapla();
}
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
		
		System.out.print("Eklenecek iþçi sayýsýný giriniz: ");
		int sayi=scanner.nextInt();
		
		for(int i=0;i<sayi;i++)
		{
			System.out.print((i+1)+". iþcinin adý: ");
			ad = scanner.next();
			System.out.print((i+1)+". iþcinin soyadý: ");
			soyad = scanner.next();
			System.out.print((i+1)+". iþcinin yaþý: ");
			yas = scanner.nextInt();
			System.out.print((i+1)+". iþcinin çocuk sayýsý: ");
			cs = scanner.nextInt();
			Isci isci=new Isci(ad, soyad, yas, cs);
			liste.add(isci);
			System.out.println(" ");
		}
		
		System.out.println("***Listedeki Ýþçiler***");
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
