package hafta2;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args)
	{
		int kalan;
		String str="", sonuc = null;
		Scanner scanner=new Scanner(System.in);
		System.out.print("�kili say� sistemine �evirmek istedi�iniz say�: ");
		int sayi = scanner.nextInt();
		int temp = sayi;
		while(temp<0)
		{
			temp = temp/2;
			kalan = temp%2;
			sonuc=str+kalan;
		}
		System.out.println("Girilen sayi:"+sayi+" Binary kar��l���:"+str);
	}
}
