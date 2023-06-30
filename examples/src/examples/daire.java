package examples;

import java.util.Scanner;

public class daire {
	
	static public void main(String[] args)
	{
		int yaricap,alan,cevre;
		double pi=3.14;
		
		Scanner reader=new Scanner(System.in);
		System.out.print("Yarýçapý girin: ");
		yaricap = reader.nextInt();
		
		alan = (int) (pi*yaricap*yaricap);
		cevre = (int) (2*pi*yaricap);
		
		System.out.println("Yarýçap: "+yaricap+" olan dairenin alaný: "+alan+" çevresi: "+cevre);
	}
}
