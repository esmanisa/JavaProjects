package hafta2;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args)
	{
		int kalan;
		String str="", sonuc = null;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ýkili sayý sistemine çevirmek istediðiniz sayý: ");
		int sayi = scanner.nextInt();
		int temp = sayi;
		while(temp<0)
		{
			temp = temp/2;
			kalan = temp%2;
			sonuc=str+kalan;
		}
		System.out.println("Girilen sayi:"+sayi+" Binary karþýlýðý:"+str);
	}
}
