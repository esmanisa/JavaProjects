package ArrayExample;

import java.util.Arrays;

public class Array {
	public static void main(String [] args)
	{
		int []d1=new int[4];
		d1[0]=1;
		d1[1]=2;
		d1[2]=3;
		d1[3]=4;
		System.out.println("d1-->"+d1[0]);
		int []d2= {0,2,4,6};
		System.out.println("d2-->"+d2[2]);
		System.out.println("d1 uzunluðu-->"+d1.length);
		int [] k1= {8,4,10};
		String [] k2= {"001", "Mehmet", "Ahmet"};
		Arrays.sort(k1);
		Arrays.sort(k2);
		System.out.println("**");
		System.out.println("**");
		System.out.println("k1[0]--> "+k1[0]);
		System.out.println("k1[1]--> "+k1[1]);
		System.out.println("k1[1]--> "+k1[2]);
		System.out.println("**");

		System.out.println("k2[0]--> "+k2[0]);
		System.out.println("k2[1]--> "+k2[1]);
		System.out.println("k2[2]--> "+k2[2]);


	}
}
