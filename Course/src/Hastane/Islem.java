package Hastane;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args)
	{
		Bashekim b=new Bashekim("Hakan", "Yurt", 8877, "Profes�r", "Dahiliye", 20);
		Kardiyoloji k=new Kardiyoloji("G�lhan","Tan",8874,"Do�ent");
		Noroloji n=new Noroloji("Ceylin", "G�l", 8875, "Ankara �niversitesi");
		Scanner scanner=new Scanner(System.in);
		
		String komut="Hastane sistemine ho� geldiniz...\n"
				+ "Yapabilece�iniz ��lemler\n"
				+ "Ba�hekim birimi ile ilgili i�lemler i�in 1'e\n"
				+ "Kardiyoloji birimiylr ilgili i�lemler i�in 2'ye\n"
				+ "N�roloji birimiyle ilgili i�lemler i�in 3'e\n"
				+ "Sistemden ��kmak i�in 0'a bas�n�z.";
		while (true)
		{
			System.out.println("**********************************");
			System.out.println(komut);
			System.out.println("**********************************");
			System.out.println("");
			System.out.print("L�tfen yapmak istedi�iniz i�lemi giriniz: ");
			String secim=scanner.nextLine();
			while(true)
			{
				if(secim.equals("0"))
				{
					System.out.println("Sistemden ��k�� yap�l�yor...");
					Thread.sleep(3000);
					return;
				}
				else if (secim.equals("1"))
				{
					System.out.println("Ba�hekimli�e Ho�geldiniz...\n"
							+ "Ba�hekim bilgileri tan�mlan�yor..");
					b.yaka_kart�_oku();
					b.calis();
					System.out.println("Ba�hekim �al��mas�n� bitirdi.");
					break;
				}
				else if(secim.equals("2"))
				{
					System.out.println("Kardiyoloji birimine ho�geldiniz...\n"
							+ "Kardiyoloji doktorunun bilgileri tan�mlan�yor..");
					k.yaka_kart�_oku();
					String s="Kalp krizi riski hesaplamak i�in 1'e\n"
							+ "EKG �ektirmek i�in 2'ye bas�n�z.";
					System.out.println(s);
					String secim2=scanner.nextLine();
					if(secim2.equals("1"))
					{
						k.riskHesapla();
						break;
					}
					else if(secim2.equals("2"))
					{
						k.ekg_cek();
						break;
					}
					else
					{
						System.out.println("Hatal� se�im yapt�n�z.");
						break;
					}
				}
				else if(secim.equals("3"))
				{
					System.out.println("N�roloji birimine ho�geldiniz...\n"
							+ "N�roloji doktorunun bilgileri tan�mlan�yor..");
					n.yaka_kart�_oku();
					String m="Ba� a�r�s� tedavisi i�in 1'e\n"
							+ "Uyku bozuklu�u tedavisi i�in 2'ye bas�n�z..";
					System.out.println(m);
					String secim3=scanner.nextLine();
					if (secim3.equals("1"))
					{
						n.bas_agrisi();
						break;
					}
					else if(secim3.equals("2"))
					{
						n.uyku_bozuklugu();
						break;
					}
					else
					{
						System.out.println("Hatal� bir se�im yapt�n�z...");
						break;
					}
					
				}
			}
		}
		
	}
}
