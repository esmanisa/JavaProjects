package dizi;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
	{
		int db;
		Scanner scan=new Scanner(System.in);
		System.out.print("Dizi boyutunu giriniz: ");
		db = scan.nextInt();
		
		int[] dizi=new int[db];
		
		for(int i=0; i<db;i++)
		{
			System.out.print("Dizi elemanýný giriniz: ");
			dizi[i] = scan.nextInt();
		}
		
		for(int i=0; i<db;i++)
		{
			System.out.println("Dizi elemaný "+dizi[i]);
		}
		
		BubbleSort(dizi);
		System.out.println("Dizinin sýralanmýþ hali.");
		
		for(int i=0; i<db;i++)
		{
			System.out.println("Dizi elemaný "+dizi[i]);
		}
	}

	private static void BubbleSort(int[] dizi) {
		int gecici;
		
		for(int i=0; i<dizi.length; i++)
		{
			for (int j=0;j<dizi.length-1;j++)
			{
				if(dizi[j] > dizi[j+1])
				{
					gecici = dizi[j];
					dizi[j] = dizi[j+1];
					dizi[j+1] = gecici;
				}
			}
		}
		
	}
}
