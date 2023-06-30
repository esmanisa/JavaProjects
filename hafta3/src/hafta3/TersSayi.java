package hafta3;

import java.util.Scanner;

public class TersSayi {
	public static void main(String[] args)
	{
		int kalan, ters=0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int sayi=scanner.nextInt();
		while(sayi>0)
		{
			kalan=sayi%10;
			ters=ters*10+kalan;
			sayi=sayi/10;
		}
		System.out.println("Girilen sayinin tersi: "+ters);
	}
}
