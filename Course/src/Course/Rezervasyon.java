package Course;

import java.util.Scanner;

public class Rezervasyon {
	public static void main(String[] args)
	{
		String [] a=new String[12];
		a[9]="Emel Ak";
		a[2]="Kaz�m Can";
		a[3]="Mehmet Akif";
		a[7]="Ali Canan";
		a[2]="Canan Cebel";
		a[4]="Samet G�l";
		Scanner scanner=new Scanner(System.in);
		String message="****Pansiyonumuza Ho�geldiniz****\n"
				+ "Pansiyonumuzda 12 adet 1'den 12'ye kadar numaral� odalar bulunmaktad�r.\n";
		System.out.println(message);
		String info1="L�tfen pansiyonda kalmak i�in ad�n�z� girin\n";
		System.out.println(info1);
		String ad=scanner.next();
		String info2="Kalmak istedi�iniz oda numaras�n� girin: ";
		System.out.println(info2);
		int oda=scanner.nextInt();
	}
}
