package Course;

import java.util.Scanner;

public class Rezervasyon {
	public static void main(String[] args)
	{
		String [] a=new String[12];
		a[9]="Emel Ak";
		a[2]="Kazým Can";
		a[3]="Mehmet Akif";
		a[7]="Ali Canan";
		a[2]="Canan Cebel";
		a[4]="Samet Gül";
		Scanner scanner=new Scanner(System.in);
		String message="****Pansiyonumuza Hoþgeldiniz****\n"
				+ "Pansiyonumuzda 12 adet 1'den 12'ye kadar numaralý odalar bulunmaktadýr.\n";
		System.out.println(message);
		String info1="Lütfen pansiyonda kalmak için adýnýzý girin\n";
		System.out.println(info1);
		String ad=scanner.next();
		String info2="Kalmak istediðiniz oda numarasýný girin: ";
		System.out.println(info2);
		int oda=scanner.nextInt();
	}
}
