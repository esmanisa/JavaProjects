package hafta1;

import java.util.Scanner;

public class Asal {
	public static void main(String [] args) {
		int i;
		int sayi;
		int sayac = 0;

		System.out.print("Sayý: ");
		Scanner reader = new Scanner(System.in);
		sayi = reader.nextInt();
		
		for(i=2;i<sayi;i++) {
			if(sayi%i==0) {
				sayac++;
			}
		}
		if(sayac==0) {
			System.out.println("Asal.");
		}else {
			System.out.println("Asal deðil.");
		}
	}
}
