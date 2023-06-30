package Hastane;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args)
	{
		Bashekim b=new Bashekim("Hakan", "Yurt", 8877, "Profesör", "Dahiliye", 20);
		Kardiyoloji k=new Kardiyoloji("Gülhan","Tan",8874,"Doçent");
		Noroloji n=new Noroloji("Ceylin", "Gül", 8875, "Ankara Üniversitesi");
		Scanner scanner=new Scanner(System.in);
		
		String komut="Hastane sistemine hoþ geldiniz...\n"
				+ "Yapabileceðiniz Ýþlemler\n"
				+ "Baþhekim birimi ile ilgili iþlemler için 1'e\n"
				+ "Kardiyoloji birimiylr ilgili iþlemler için 2'ye\n"
				+ "Nöroloji birimiyle ilgili iþlemler için 3'e\n"
				+ "Sistemden çýkmak için 0'a basýnýz.";
		while (true)
		{
			System.out.println("**********************************");
			System.out.println(komut);
			System.out.println("**********************************");
			System.out.println("");
			System.out.print("Lütfen yapmak istediðiniz iþlemi giriniz: ");
			String secim=scanner.nextLine();
			while(true)
			{
				if(secim.equals("0"))
				{
					System.out.println("Sistemden çýkýþ yapýlýyor...");
					Thread.sleep(3000);
					return;
				}
				else if (secim.equals("1"))
				{
					System.out.println("Baþhekimliðe Hoþgeldiniz...\n"
							+ "Baþhekim bilgileri tanýmlanýyor..");
					b.yaka_kartý_oku();
					b.calis();
					System.out.println("Baþhekim çalýþmasýný bitirdi.");
					break;
				}
				else if(secim.equals("2"))
				{
					System.out.println("Kardiyoloji birimine hoþgeldiniz...\n"
							+ "Kardiyoloji doktorunun bilgileri tanýmlanýyor..");
					k.yaka_kartý_oku();
					String s="Kalp krizi riski hesaplamak için 1'e\n"
							+ "EKG çektirmek için 2'ye basýnýz.";
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
						System.out.println("Hatalý seçim yaptýnýz.");
						break;
					}
				}
				else if(secim.equals("3"))
				{
					System.out.println("Nöroloji birimine hoþgeldiniz...\n"
							+ "Nöroloji doktorunun bilgileri tanýmlanýyor..");
					n.yaka_kartý_oku();
					String m="Baþ aðrýsý tedavisi için 1'e\n"
							+ "Uyku bozukluðu tedavisi için 2'ye basýnýz..";
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
						System.out.println("Hatalý bir seçim yaptýnýz...");
						break;
					}
					
				}
			}
		}
		
	}
}
