package Liste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
	public static void main(String[] args)
	{
		ArrayList<String>arrayList1=new ArrayList<String>();
		arrayList1.add("Kaz�m Karabekir");
		arrayList1.add("Merve Tan");
		arrayList1.add("Burak Ak");
		arrayList1.add("Nisa Berk");
		Iterator<String> i1=arrayList1.iterator();
		
		while(i1.hasNext())
			System.out.println("�ye-"+i1.next());
		
		System.out.println(" ");
		ListIterator<String> i2=arrayList1.listIterator();
		
		while(i2.hasNext())
		{
			Object o1=i2.next();
			i2.set(o1+"/");
		}
		i1=arrayList1.iterator();
		
		while(i1.hasNext())
			System.out.println("�ye-"+i1.next());
		
		System.out.println(" ");
		
		while(i2.hasPrevious())
			System.out.println("�ye-"+i2.previous());
	}
} 
