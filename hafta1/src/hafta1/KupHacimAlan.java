package hafta1;

import java.util.Scanner;

public class KupHacimAlan {
	public static void main(String[] args) {
		int x;
		System.out.print("Kupun kesiti: ");
		Scanner reader = new Scanner(System.in);
		x = reader.nextInt();
		System.out.println("Kupun hacmi: "+(x*x*x)+"\nKupun alani: "+(x*x*6));
			
	}

}
