package dizi;

import java.util.Scanner;

public class IkiBoyutluDizi {
	public static void main(String[] args)
	{
		int satir, sutun;
		Scanner scan=new Scanner(System.in);
		System.out.print("Dizinin satýr sayisini giriniz: ");
		satir = scan.nextInt();
		System.out.print("Dizinin sütun sayisini giriniz: ");
		sutun = scan.nextInt();
		
		int[][] dizi=new int [satir][sutun];
		
		for (int i=0; i<satir;i++)
		{
			for (int j=0;j<sutun;j++)
			{
				System.out.print("Dizinin "+i+" "+j+". elemanýný giriniz: ");
				dizi[i][j]= scan.nextInt();
			}
		}
		
		for (int i=0; i<satir;i++)
		{
			for (int j=0;j<sutun;j++)
			{
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		for (int i=0; i<satir;i++)
		{
			double satirToplam=0;
			for (int j=0;j<sutun;j++)
			{
				satirToplam = satirToplam+dizi[i][j];
			}
			satirToplam = satirToplam/sutun;
			System.out.println(i+". satýrýn ortalamasý: "+satirToplam);
		}
	}

}
