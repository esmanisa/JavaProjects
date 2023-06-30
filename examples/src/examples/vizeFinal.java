package examples;

import java.util.Locale;
import java.util.Scanner;

public class vizeFinal {
	
	static public void main(String[] args)
	{
		double vize, final_not, gn;
		Scanner scan=new Scanner(System.in);
		
		scan.useLocale(Locale.US);
		System.out.print("Vize notunu giriniz: ");
		vize=scan.nextDouble();
		
		System.out.print("Final notunu giriniz: ");
		final_not=scan.nextDouble();
		gn = (vize*0.4) + (final_not*0.6);
		
		System.out.println("Vize notu: "+vize+"\nFinal notu: "+final_not+"\nGeçme notu: "+gn);
	}
}
