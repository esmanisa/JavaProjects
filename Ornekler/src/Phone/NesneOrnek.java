package Phone;

import java.util.Scanner;

public class NesneOrnek {
	public static void main(String[] args)
	{
		int ns, hafiza;
		String marka, model;
		Scanner scan=new Scanner(System.in);
		System.out.print("Nesne sayisini giriniz: ");
		ns = scan.nextInt();
		
		SmartPhone[] nesneler=new SmartPhone[ns];
		
		for (int i=0;i<ns;i++)
		{
			System.out.print(i+1+". telefonun markasýný giriniz: ");
			marka = scan.next();
			System.out.print(i+1+". telefonun modelini giriniz: ");
			model = scan.next();
			System.out.print(i+1+". telefonun hafýzasýný giriniz: ");
			hafiza = scan.nextInt();
			
			nesneler[i] = new SmartPhone(marka, model, hafiza);
		}
		
		for (int i=0;i<ns;i++)
		{
			nesneler[i].bilgileriYazdir();
		}
		
		nesneleriDegistir(nesneler);
		
		for (int i=0;i<ns;i++)
		{
			nesneler[i].bilgileriYazdir();
		}
	}

	private static void nesneleriDegistir(SmartPhone[] nesneler) {
		int indis1, indis2;
		indis1=(int) (Math.random()*(nesneler.length));
		indis2=(int) (Math.random()*(nesneler.length));
		
		while (indis1==indis2)
			indis2=(int) (Math.random()*(nesneler.length));
		
		System.out.println("\n"+indis1+". ile "+indis2+". indis yer deðiþtirilecek.");
		SmartPhone gecici;
		gecici = nesneler[indis1];
		nesneler[indis1]=nesneler[indis2];
		nesneler[indis2]=gecici;
	}
}
