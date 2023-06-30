package hafta1;

import java.util.Scanner;

public class NumberofDigits {
	public static void main(String[] args) {
		int n;
		int d;
		
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		d = 1;
		while(n>9) {
			n = n / 10;
			d += 1;
		}
		System.out.println(d);
	}
}
