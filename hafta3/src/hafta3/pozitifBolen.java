/*Kullanýcýdan alýnan bir sayýnýn pozitif bölenlerini ekrana yazdýran Java kodunu yazýnýz.*/
package hafta3;

import java.util.Scanner;

public class pozitifBolen {
	public static void main(String[] args)
	{
		int a=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Pozitif bölenlerini bulmak istediðiniz sayýyý giriniz: ");
		int sayi=scanner.nextInt();
		for(int i=1; i<=sayi;i++)
		{
			if(sayi%i==0)
			{
				System.out.println(sayi+" sayýsýnýn "+a+". pozitif böleni: "+i);
				a+=1;
			}
		}
	}
}
