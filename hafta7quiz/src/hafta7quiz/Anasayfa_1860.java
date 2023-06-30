package hafta7quiz;

import java.util.Scanner;

public class Anasayfa_1860 {
	public static void main(String[] args)
	{
		int mos, ros, yas = 0, gs;
		double tp;
		String ad = null,soyad = null;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Matematik öðretmeni sayýsýný giriniz: ");
		mos = scanner.nextInt();
		
		System.out.print("Resim öðretmeni sayýsýný giriniz: ");
		ros = scanner.nextInt();

		MatematikOgretmeni_1860[] mat=new MatematikOgretmeni_1860[mos];
		ResimOgretmeni_1860[] resim=new ResimOgretmeni_1860[ros];
		
		for (int i=0; i<mos; i++)
		{
			System.out.print("Öðretmenin adý: ");
			ad=scanner.next();
			System.out.print("Soyadý: ");
			soyad=scanner.next();
			System.out.print("Yaþý: ");
			yas = scanner.nextInt();
			System.out.print("Görev süresi: ");
			gs = scanner.nextInt();
			mat[i] = new MatematikOgretmeni_1860(ad, soyad, yas, gs);
		}
		for (int i=0; i<ros; i++)
		{
			System.out.print("Öðretmenin adý: ");
			ad=scanner.next();
			System.out.print("Soyadý: ");
			soyad=scanner.next();
			System.out.print("Yaþý: ");
			yas = scanner.nextInt();
			System.out.print("Görev süresi: ");
			gs = scanner.nextInt();
			resim[i] = new ResimOgretmeni_1860(ad, soyad, yas, gs);
		}
		
		Ogretmen_1860 o= new Ogretmen_1860(ad, soyad, yas);
		
		o.OgretmenSayisiVer();
		mat[mos].BilgieriYazdir();
		resim[ros].BilgieriYazdir();
		
	}
	void OgretmenSirala(MatematikOgretmeni_1860[a] mat)
	{
		int tp;
		
		for(int i=0; i<mat.length; i++)
		{
			for (int j=0;j<mat.length-1;j++)
			{
				if(mat[j] > mat[j+1])
				{
					tp = mat[j];
					mat[j] = mat[j+1];
					mat[j+1] = tp;
				}
			}
		}
	}
	
	void OgretmenSirala(ResimOgretmeni_1860[] resim)
	{
		
	}
}
