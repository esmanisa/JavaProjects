/*Kullan�c�dan al�nan bir say�n�n pozitif b�lenlerini ekrana yazd�ran Java kodunu yaz�n�z.*/
package hafta3;

import java.util.Scanner;

public class pozitifBolen {
	public static void main(String[] args)
	{
		int a=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Pozitif b�lenlerini bulmak istedi�iniz say�y� giriniz: ");
		int sayi=scanner.nextInt();
		for(int i=1; i<=sayi;i++)
		{
			if(sayi%i==0)
			{
				System.out.println(sayi+" say�s�n�n "+a+". pozitif b�leni: "+i);
				a+=1;
			}
		}
	}
}
