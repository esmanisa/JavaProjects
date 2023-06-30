package Liste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class JavaKulubu {
	public static void main(String[] args)
	{
		/*
		 * ArrayList Kullanarak
		List<String>a1=new ArrayList();
		ArrayList<String>a2=new ArrayList<String>();
		
		a1.add("Kaz�m Karabekir");
		a1.add("Merve Tan");
		a1.add("Burak Ak");
		a1.add("Nisa Berk");
		
		for(String s:a1)
		{
			System.out.println("�ye-"+s);
		}
		a1.remove(3);
		
		System.out.println(" ");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println("�ye-"+a1.get(i));
		}*/
		
		/*LinkedList Kullanarak*/
		
		LinkedList<String>linked=new LinkedList();
		linked.add("Kaz�m Karabekir");
		linked.add("Merve Tan");
		linked.add("Burak Ak");
		linked.add("Nisa Berk");
		
		/*for(String s:linked)
		{
			System.out.println("�ye-"+s);
		}
		linked.add(0, "Mehmet G�l");
		
		System.out.println(" ");
		for(int i=0;i<linked.size();i++)
			System.out.println("�ye-"+linked.get(i));
		linked.clear();*/
		
		uyeleri_yazdir(linked);		
		
	}
	public static void uyeleri_yazdir(LinkedList<String>linked)
	{
		ListIterator<String>a= linked.listIterator();
		while(a.hasNext())
		{
			System.out.println("�ye-"+a.next());
		}
	}
}
