package GirisCikis;

import java.util.Scanner;

//API(Application Programming Interface)

public class IO {
	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Bir deðer giriniz: ");
			String g=scanner.nextLine(); //input
			System.out.println(g);  // output
			
			
		} catch (Exception e) {
			System.out.println("Bir hata oluþtu..");
		}
	}
}
