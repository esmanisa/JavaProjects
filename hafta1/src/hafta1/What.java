package hafta1;

import java.util.Scanner;

public class What {
	public static void main(String[] args) {
		int m;
		int n;
		Scanner reader = new Scanner(System.in);
		System.out.print("Sayi 1: ");
		n = reader.nextInt();
		System.out.print("Sayi 2: ");
		m = reader.nextInt();
		while(m != m) {
			if(m > n) {
					m = m - n;
			}else {
					n = n - m;
			}
		}
		System.out.println(m);
	}
}
